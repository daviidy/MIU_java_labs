package final_practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		List<Product> arr1 = new ArrayList<Product>();
		
		Product p1 = new Product("M12SG", "Computer", "lBM", 1200.0);
		Product p2 = new Product("D1KS8", "Microwave", "LG", 400.23);
		Product p3 = new Product("M024G", "Computer", "lApple", 1800.4);
		Product p4 = new Product("2V2SG", "Staloon car", "Mercedes", 30458.5);
		Product p5 = new Product("B72SW", "Motorcyle", "IYamaha", 3856);
		Product p6 = new Product("A13RM", "Wagon car", "BMW", 28689.25);
		Product p7 = new Product("M68H9", "Motorcycle", "StHonda", 3565.48);
		Product p8 = new Product("ZJ24Q", "Computer", "lToshiba", 1500);
		
		arr1.add(p8);
		arr1.add(p7);
		arr1.add(p6);
		arr1.add(p5);
		arr1.add(p4);
		arr1.add(p3);
		arr1.add(p2);
		arr1.add(p1);
		
		//Personal Investigations
		System.out.println(arr1.stream().count());
		System.out.println(arr1.stream().mapToLong(e -> 1L).sum());
		
//4.a) Print out the average of all prices
		System.out.println("Average price of all products in the list.");
		System.out.printf("%.2f", arr1.stream()
											.mapToDouble(Product::getPrice)
											.average()
											.getAsDouble());
		System.out.println("\n");
		
//4.b) Print out all the Product manufacturers that begin with the letter 'P', in sorted order and get rid of all duplicates. Print out only the manufacturer data
		System.out.println("All manufacturers starting with a specified letter and sorted in order.");
		arr1.stream()
			.filter(m -> m.getManufacturer().startsWith("I"))
			.map(Product::getManufacturer)
			.sorted()
			.forEach(System.out::println);
		//Consider sorting in descending order
		//Consider ignoring letter case
		System.out.println();
		
//4.c) Use the reduce method to get total sum of all the price data
		
		
		System.out.printf("%.2f%n", arr1.stream()
				.map(Product::getPrice)
				.reduce(0.0, (a, b) -> a + b));
		
//4.d) Print manufac
		
		List<Product> dellProducts = arr1.stream()
										.filter(e -> e.getManufacturer().equals("IBM") && e.getPrice() > 40)
										.collect(Collectors.toList());
		
		System.out.println(dellProducts);
		
//4.e) Print out all the product objects, but if the manufacturer begins with the letter 'd' then capitalize the manufacturer
		arr1.stream()
			.forEach(m -> System.out.println(m.getManufacturer().startsWith("d") ? m.getManufacturer().toUpperCase() : m));
		
//4.f)Print out all the product objects with the following restrictions; sort by manufacturer only the object whose manufacturer
		//begins with the letter 'l' (all other product objects are not sorted). And print out those sorted objects at the very beginning all the unsorted
		System.out.println("-----------------------------");
			Stream.concat(arr1.stream()
				.filter(e -> e.getManufacturer().startsWith("l"))
				.sorted(Comparator.comparing(Product::getManufacturer)),
				arr1.stream()
				.filter(e -> !(e.getManufacturer().startsWith("l"))))
				.forEach(System.out::println);
			
			//.g) All the product objects; if the manufacturer begins with the letter 'd' then print these objects first, and if the manufacturer begins with
			//'h' the print them second immediately after all the d. At the end print out  the rest.
			
					//To be implemented later
			
			
			System.out.println("-----------------------------");
			
			//.h) Save to a list all of the product objects, but if the manufacturer begins with "St" then capitalize all the manufacturers name
			List<Product> p = arr1.stream()
					.map(e -> {
						if(e.getManufacturer().startsWith("St")) {
							
							try {
								Product copy = (Product)e.clone();
								copy.setManufacturer(copy.getManufacturer().toUpperCase());
								e = copy;
							} catch (CloneNotSupportedException e1) {
								e1.getMessage();
							}
							
						}
						return e;
					})
					.collect(Collectors.toList());
			
			System.out.println(p);
			
			//i)
			System.out.println("-----------------------------");
			String s2 = arr1.stream()
					.map(Product::toString)
					.collect(Collectors.joining("*****"));
			System.out.println(s2);
			
			//j)
			System.out.println("-----------------------------");
			arr1.stream()
			.map(x -> {
				if (x.getDescription().length() >= 3) {
//					String c = x.getDescription().substring(2,3).toUpperCase();
					char s = Character.toUpperCase(x.getDescription().charAt(2));
					x.setDescription(x.getDescription().substring(0,2) + s + x.getDescription().substring(3));
				}
				return x;
			})
			.forEach(System.out::println);
			

	}

}
