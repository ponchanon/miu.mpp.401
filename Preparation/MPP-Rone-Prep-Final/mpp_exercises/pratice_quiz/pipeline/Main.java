package pipeline;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import quizclasses.Employee;
import quizclasses.EmployeeTestData;
import quizclasses.Pair;
import quizclasses.TraderPair;
import quizclasses.TraderTransactTestData;
import quizclasses.Transaction;
import quizclasses.Util;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//SAMPLE: Create a stream pipeline that does the following:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		sampleData.stream().filter(e -> e.getName().length() > 5 && e.getYearOfBirth() > 1970)
		.toList().forEach(System.out::println);;
				
		//prob1();
		//prob2();
		prob3();
	}
	
	//Create a stream pipeline that obtains a list of
	//all name/salary pairs extracted from a list of Employees
	//for which salary > 55000 and less than 120000, in ascending
	//order of name, then descending order of salary
	//Then print the list to the console. Represent pairs using
	//the Pair class that is provided in the quizclasses package
	public static void prob1() {
		//use this list 
		System.out.println(" =============== prob1 ============ ");
		List<Employee> list = EmployeeTestData.getList();
		list.stream().filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
			.sorted(Comparator.comparing(Employee::getName)
					.thenComparing(Employee::getSalary, Comparator.reverseOrder()))
			.map(e -> new Pair(e.getName(), e.getSalary()))
			.toList().forEach(System.out::println);
		
	}
	
	//Create a stream pipeline to find all transactions that took place
	//in the year 2011 
	//and sort them by value (small to high), and print to console
	//(Note: there is an instance variable "value" in Transaction)
	public static void prob2() {
		//use this list	
		System.out.println(" =============== prob2 ============ ");
		List<Transaction> list = TraderTransactTestData.getTransactions();
		System.out.println("=> transactions that took place in the year 2011: ");
		list.stream().filter(t -> t.getYear() == 2011)
			.sorted(Comparator.comparing(Transaction::getValue)).toList()
			.forEach(System.out::println);
	}
	
	
	// Create a stream pipeline to find all pairs of traders who are associates 
	// and come from the same city. 
	// Use the class TraderPair to represent pairs of traders.
	// Sort these TraderPairs first by name of first trader, then by name of second trader.
	// Finally, print these pairs to the console. Make sure the final list contains
	// no duplicates (Example:  the pair (Tom, Joe) is a duplicate of (Joe, Tom).)
	// HINT: To get started, use the method in the Util class in quizclasses package.
	public static void prob3() {
		//Use this list
		List<Transaction> list = TraderTransactTestData.getTransactions();
		System.out.println("================== prob3 =================== ");
		Util.allTraderPairs(list.stream().map(t -> t.getTrader()))
		.filter(p -> p.getTrader1().getCity().equals(p.getTrader2().getCity()))
		.distinct()
		.sorted(Comparator.comparing((TraderPair p) -> p.getTrader1().getName())
				.thenComparing(p -> p.getTrader2().getName()))
		.toList().forEach(System.out::println);          
	}
}
