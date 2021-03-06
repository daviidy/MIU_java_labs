// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
   public static void main(String[] args)
   {
      // initialize array of Employees
      Employee[] employees = {
         new Employee("Jason", "Red", 5000, "IT"),
         new Employee("Ashley", "Green", 7600, "IT"),
         new Employee("Matthew", "Indigo", 3587.5, "Sales"),
         new Employee("James", "Indigo", 4700.77, "Marketing"),
         new Employee("Luke", "Indigo", 6200, "IT"),
         new Employee("Jason", "Blue", 3200, "Sales"),
         new Employee("Wendy", "Brown", 4236.4, "Marketing")};

      // get List view of the Employees
      List<Employee> list = Arrays.asList(employees);

      // display all Employees
      System.out.println("Complete Employee list:");
      list.stream().forEach(System.out::println);   //A method reference.
      
      // Predicate (boolean-valued function) that returns true for salaries 
      //in the range $4000-$6000
      Predicate<Employee> fourToSixThousand = 
         e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

      // Display Employees with salaries in the range $4000-$6000
      // sorted into ascending order by salary
      System.out.printf(
         "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

      list.stream()
          .filter(fourToSixThousand)
          .sorted(Comparator.comparing(Employee::getSalary))
          .forEach(System.out::println);

      // Display first Employee with salary in the range $4000-$6000
      System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
         list.stream()
             .filter(fourToSixThousand)
             .findFirst()
             .get());

      // Functions for getting first and last names from an Employee
      Function<Employee, String> byFirstName = Employee::getFirstName;
      Function<Employee, String> byLastName = Employee::getLastName;

      // Comparator for comparing Employees by first name then last name
      Comparator<Employee> lastThenFirst = 
         Comparator.comparing(byLastName).thenComparing(byFirstName);

      // sort employees by last name, then first name 
      System.out.printf(
         "%nEmployees in ascending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst)
          .forEach(System.out::println);

      // sort employees in descending order by last name, then first name
      System.out.printf(
         "%nEmployees in descending order by last name then first:%n");
      list.stream()
          .sorted(lastThenFirst.reversed())
          .forEach(System.out::println);

      // display unique employee last names sorted
      System.out.printf("%nUnique employee last names:%n");
      list.stream()
          .map(Employee::getLastName)
          .distinct()
          .sorted()
          .forEach(System.out::println);

      // display only first and last names
      System.out.printf(
         "%nEmployee names in order by last name then first name:%n"); 
      list.stream()
          .sorted(lastThenFirst)
          .map(Employee::getName)
          .forEach(System.out::println);

//      // group Employees by department
//      System.out.printf("%nEmployees by department:%n"); 
//      Map<String, List<Employee>> groupedByDepartment =
//         list.stream()
//             .collect(Collectors.groupingBy(Employee::getDepartment));
//
//      groupedByDepartment.forEach(
//         (department, employeesInDepartment) -> 
//         {
//            System.out.println(department);
//            employeesInDepartment.forEach(
//               employee -> System.out.printf("   %s%n", employee));
//         }
//      );

      // count number of Employees in each department
      System.out.printf("%nCount of Employees by department:%n"); 

      Map<String, Long> employeeCountByDepartment =
         list.stream()
             .collect(Collectors.groupingBy(Employee::getDepartment, 
                TreeMap::new, Collectors.counting()));

      employeeCountByDepartment.forEach(
         (department, count) -> System.out.printf(
            "%s has %d employee(s)%n", department, count));

/*  Output looks something like :

        HR  4
        IT  8
        Sales  12
*/


      // sum of Employee salaries with DoubleStream sum method
      System.out.printf(
         "%nSum of Employees' salaries (via sum method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .sum());

      // calculate sum of Employee salaries with Stream reduce method
      System.out.printf(
         "Sum of Employees' salaries (via reduce method): %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .reduce(0, (value1, value2) -> value1 + value2));  

      // average of Employee salaries with DoubleStream average method
      System.out.printf("Average of Employees' salaries: %.2f%n",
         list.stream()
             .mapToDouble(Employee::getSalary)
             .average()
             .getAsDouble());      
      
      System.out.printf("Number of last names beginning with 'B': %d%n",
    		  list.stream()
    		  .filter(value -> value.getLastName().startsWith("B", 0))
    		  .count());
      
      System.out.printf("Employees which last names begins with 'B', in sorted order%n");
	  list.stream()
	  .filter(value -> value.getLastName().startsWith("B", 0))
	  .sorted(Comparator.comparing(Employee::getLastName))
	  .forEach(System.out::println);
	  
	  Function<String, String> f = (x) -> x.toUpperCase();
	  
	  System.out.println("Employees which last name beginning with 'B' with first and last names to uppercase");
	  list.stream()
	  .filter(value -> value.getLastName().startsWith("B"))
//	  .map(x -> {
//		  x.setFirstName(x.getFirstName().toUpperCase());
//		  x.setLastName(x.getLastName().toUpperCase());
////		  String::lowercase();
//		  return x;
//	  })
	  .map( e -> String.format("%-8s %-8s %8.2f   %s", 
		         e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment())
	  )
	  .forEach(value -> System.out.println(value));
	  
	  
	  System.out.println("Employees (if last name begins with 'B') capitalize last name \n"); 
	  list.stream()
	  .forEach(x -> System.out.println( x.getLastName().startsWith("B") ?
              String.format("%-8s %-8s %8.2f   %s",
              x.getFirstName(), x.getLastName().toUpperCase(), x.getSalary(), x.getDepartment()) :
              x.toString())
	  );
	  
	  System.out.println("Employees (if last name begins with 'B') capitalize last name with Collector\n" + 
	  list.stream()
	  .map( e -> String.format("%-8s %-8s %8.2f   %s", 
		         e.getFirstName(), 
		         e.getLastName().startsWith("B") ? e.getLastName().toUpperCase() : e.getLastName(), 
		        		 e.getSalary(), 
		        		 e.getDepartment())
	  )
	  .collect(Collectors.joining("---\n---"))
	  );
	  
	  
	  System.out.println("Last names which begin with 'I' without duplicates");
	  list.stream()
	  .filter(value -> value.getLastName().startsWith("I"))
	  .map( e -> e.getLastName()
	  )
	  .distinct()
	  .sorted()
	  .forEach(System.out::println);
	  
	  System.out.printf("Average of all the salaries: $%8.2f",
	  list.stream()
	  .mapToDouble(Employee::getSalary)
	  .average()
	  .getAsDouble()
	  );
	  
	  System.out.printf("Total salary: $%8.2f",
		  list.stream()
		  .mapToDouble(Employee::getSalary)
		  .reduce(0, (x, y) -> x + y)
	  );
	  
	  System.out.println("First names of all the employees");
	  list.stream()
	  .map( e -> String.format("%-8s", 
		         e.getFirstName())
	  )
	  .forEach(System.out::println);
	  
	  System.out.println("Infinite stream of 20 first even numbers");
	  IntStream.iterate(0, i -> i + 2)
	  .limit(20)
	  .forEach(System.out::println);
	  
	  System.out.println("*******************************************");
	  System.out.println("countWords exercices");
	  
	  System.out.println("*******************************************");
	  System.out.println("reduce to concatenate strings");
	  
	  Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
	  
	  System.out.printf("%s", strings.reduce("", (x, y) -> x + " " + y));
	  
	  
      
   } // end main
   
   public int countWords(List<String> words, char c, char d, int len) {
		  return words.stream()
		  .filter(x -> x.length() == len && x.contains(""+c) && !(x.contains(""+d)))
		  .toArray()
		  .length;
   }
} // end class ProcessingEmployees
