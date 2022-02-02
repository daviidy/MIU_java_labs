package final_practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompanyApp {
	public static void main(String[] args) {
		List<Company> list = List.of(
					new Company("apple", "New york", "Nebraska", 5000000),
					new Company("google", "Miami", "florida", 100000),
					new Company("amazon", "New york", "Detroit", 10000),
					new Company("facebook", "Toronto", "california", 10000)
				);
		
		//a)
		list.stream()
		.filter(x -> x.getCompanyCity().startsWith("M"))
		.map(x -> x.getCompanyCity())
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("--------------------------------");
		
		//b)
		double b = list.stream()
		.mapToDouble(Company::getTotalProfitsForThisYear)
		.average()
		.getAsDouble();
		
		System.out.println(b);
		
		//c)
		double c = list.stream()
		.mapToDouble(Company::getTotalProfitsForThisYear)
		.reduce(0, (x,y) -> x + y);
		System.out.println(c);
		
		//d)
		System.out.println("--------------------------------");
		
		list.stream()
		.forEach(x -> System.out.println(x.getCompanyCity().startsWith("T") ? 
				"Company [companyName=" + x.getCompanyName() + ", companyCity=" + x.getCompanyCity().toUpperCase() + ", companyState=" + x.getCompanyState()
				+ ", totalProfitsForThisYear=" + x.getTotalProfitsForThisYear() + "]"
				: x ));
		
		//e)
		System.out.println("--------------------------------");
		
		System.out.println(list.stream()
				.filter(e -> e.getCompanyState().equals("Nebraska") && e.getTotalProfitsForThisYear() > 4000000)
				.collect(Collectors.toList()));
		
		//f)
		System.out.println("--------------------------------");
		Stream.concat
		(
				list.stream()
				.filter(e -> e.getCompanyState().startsWith("D"))
				.sorted(Comparator.comparing(Company::getCompanyState)), 
				list.stream()
				.filter(e -> !(e.getCompanyState().startsWith("D")))

		)
		.forEach(System.out::println);
		
		//g)
		System.out.println("--------------------------------");
		Stream.concat(
				Stream.concat(
							list.stream()
							.filter(e -> e.getCompanyCity().startsWith("C")), 
							list.stream()
							.filter(e -> e.getCompanyCity().startsWith("H"))
						), 
				list.stream()
				.filter(e -> !(e.getCompanyCity().startsWith("C")) && !(e.getCompanyCity().startsWith("H")))
		).forEach(System.out::println);
		
	}
}
