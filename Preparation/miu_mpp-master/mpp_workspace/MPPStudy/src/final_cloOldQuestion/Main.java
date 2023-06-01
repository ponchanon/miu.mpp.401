package final_cloOldQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		List<Company> arr1 = new ArrayList<Company>();
		arr1 = Arrays.asList(
				new Company("IBM","Moisey", "Dovan",1000.00),
				new Company("Microsoft","Tahoma", "New York",1000.00),
				new Company("Dell","Huston", "Texas",1000.00),
				new Company("Google","Dallas", "Nebraska",40000000.00),
				new Company("Daewoo","Calton", "Califonia",1000.00),
				new Company("IBM","Mohamad", "Nebraska",1000.00),
				new Company("IBM","Couse", "Dilly",1000.00),
				new Company("IBM","Truise", "Iowa",1000.00)
				);
		
		//a
		System.out.println("a) ----------------------"); 
		arr1.stream().filter(c -> c.getCompanyCity().charAt(0) == 'M')
			.map(Company::getCompanyCity)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
		//a
		System.out.println("a) ----------------------"); 
		arr1.stream().filter(c -> c.getCompanyCity().charAt(0) == 'M')
		//.map(Company::getCompanyCity)
		.distinct()
		.sorted(Comparator.comparing(Company::getCompanyCity))
		.forEach(c -> System.out.println(c.getCompanyCity()));
		
		//b - average
		System.out.println("b) ----------------------"); 
		System.out.printf("%nAverage: %s",
				arr1.stream().mapToDouble(Company::getTotalProfitForThisYear)
					.average()
					.getAsDouble()
				);
		//c - sum , use reduce
		System.out.println("c) ----------------------"); 
		System.out.printf("%nTotal Sum: %s%n",
				arr1.stream().mapToDouble(Company::getTotalProfitForThisYear)
					.reduce(0,(x,y) -> x + y)
				);
		
		//d 
		System.out.println("d) ----------------------"); 
		arr1.stream().forEach(c -> {
			if(c.getCompanyCity().charAt(0)=='T')
			{
				c.setCompanyCity(c.getCompanyCity().toUpperCase());
			}
			System.out.println(c);
		});
		
		System.out.println("e) ----------------------"); 		
		//e
		arr1.stream().filter(c -> c.getCompanyState().equals("Nebraska"))
			.filter(c-> c.getTotalProfitForThisYear() > 4000000)
			.forEach(System.out::println);
		
		//f
		System.out.println("f) ----------------------");
		Stream.concat(
				arr1.stream().filter(c -> c.getCompanyState().startsWith("D"))
				.sorted(Comparator.comparing(Company::getCompanyState))
				, arr1.stream().filter(c -> c.getCompanyState().charAt(0)!= 'D'))
			.forEach(System.out::println);
		
		
		//g
		System.out.println("g) ----------------------"); 
		Stream<Company> strMo = arr1.stream()
				.filter(c -> c.getCompanyCity().substring(0,2) == "Mo")
				.map(c -> new Company(c.getCompanyName(), c.getCompanyCity().toUpperCase(),c.getCompanyState(),c.getTotalProfitForThisYear()));
			
		Stream<Company> strNMo = arr1.stream()
				.filter(c -> c.getCompanyCity().substring(0,2) != "Mo");
		Stream<Company> combined = Stream.concat(strMo, strNMo);
		List<Company> prodList = combined.collect(Collectors.toList());
		System.out.println(prodList);
		
		//h
		System.out.println("h) ----------------------"); 
		Stream<Company> strCityC = arr1.stream()
				.filter(c -> c.getCompanyCity().charAt(0)== 'C');
		Stream<Company> strCityH = arr1.stream()
				.filter(c -> c.getCompanyCity().charAt(0) == 'H');
		Stream<Company> combined1 = Stream.concat(strCityC, strCityH);
		Stream<Company> strCityNCH = arr1.stream()
				.filter(c-> c.getCompanyCity().charAt(0) != 'C' && c.getCompanyCity().charAt(0) != 'H');
		Stream<Company> combined2 = Stream.concat(combined1, strCityNCH);
		combined2.forEach(System.out::println);
		
	}	

}
