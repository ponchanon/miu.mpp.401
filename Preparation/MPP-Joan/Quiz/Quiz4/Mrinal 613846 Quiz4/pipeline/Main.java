package Quiz4.pipeline;

import Quiz4.quizclasses.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

/** USE STREAM PIPELINES TO SOLVE THE PROBLEMS HERE */
public class Main {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		//SAMPLE: Create a stream pipeline that does the following:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		List<Employee> result = sampleData.stream()
							        .filter(e -> e.getName().length() > 5)
							        .filter(e -> e.getYearOfBirth() > 1970)
							        .collect(Collectors.toList());
		System.out.println(result);

		System.out.println();
		System.out.println("Answer of prob1");
		prob1();
		System.out.println();
		System.out.println("Answer of prob2");
		prob2();
		System.out.println();
		System.out.println("Answer of prob3");
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

		List<Employee> list = EmployeeTestData.getList();
		System.out.println(list.stream()
				.filter(e -> e.getSalary() > 55000 && e.getSalary() < 120000)
				.map(e -> new Pair(e.getName(), e.getSalary()))
				.sorted(comparing((Pair p) -> p.name).reversed()
						.thenComparing((Pair p) -> p.salary).reversed())
				.collect(Collectors.toList()));

		/*
		List<Employee> list = EmployeeTestData.getList();
		List<Pair> pairList=new ArrayList<>();
		for(Employee emp:list) {
			pairList.add(new Pair(emp.getName(), emp.getSalary()));
		}
		pairList.stream().filter(p->p.salary>55000 && p.salary<120000)
				.sorted((p1,p2)->{
					if(p1.name.compareTo(p2.name)>0) return 1;
					else if(p1.name.compareTo(p2.name)<0) return -1;
					else return 0;
				}).sorted((p1,p2)->{
					if(p1.salary>p2.salary) return -1;
					else if(p1.salary<p2.salary) return 1;
					else return 0;
				})

				.forEach(s->System.out.println(s.name+"====>"+s.salary));
		*/
	}
	
	//Create a stream pipeline to find all transactions that took place
	//in the year 2011 
	//and sort them by value (small to high), and print to console
	//(Note: there is an instance variable "value" in Transaction)

	public static void prob2() {
		//use this list	

		List<Transaction> list = TraderTransactTestData.getTransactions();
		list.stream().filter(t->t.getYear()==2011)
		//list.stream().filter((transaction -> transaction.getYear()>2010 && transaction.getYear()<2014))
				.sorted(Comparator.comparing(Transaction::getValue))
				//.sorted(Comparator.comparing(Transaction::getYear))
				.forEach(s->System.out.println(s.toString()));
	}
	
	// Create a stream pipeline to find all pairs of traders who are associates 
	// and come from the same
	// city. Use the class TraderPair to represent pairs of traders.
	// Sort these TraderPairs first by name of first trader, then by name of second trader.
	// Finally, print these pairs to the console. Make sure the final list contains
	// no duplicates (Example:  the pair (Tom, Joe) is a duplicate of (Joe, Tom).)
	// HINT: To get started, use the method in the Util class in quizclasses package.
	public static void prob3() {
		//Use this list

		List<Transaction> list = TraderTransactTestData.getTransactions();
		List<Trader> tradeList=new ArrayList<>();
		for(Transaction t: list) {
			tradeList.add(t.getTrader());
		}
		List<TraderPair> tdList=Util.allTraderPairs(tradeList.stream())
				.filter(s->s.getTrader1().isAssociate(s.getTrader2())
						&& s.getTrader1().getCity().equals(s.getTrader2().getCity()))
				.sorted((TP1,TP2)->{
					if(TP1.getTrader1().getName().compareTo(TP2.getTrader1().getName())>0) return 1;
					else if(TP1.getTrader1().getName().compareTo(TP2.getTrader1().getName())<0) return -1;
					else return 0;
				}).sorted((TP1,TP2)->{
					if(TP1.getTrader2().getName().compareTo(TP2.getTrader2().getName())>0) return 1;
					else if(TP1.getTrader2().getName().compareTo(TP2.getTrader2().getName())<0) return -1;
					else return 0;
				}).distinct().collect(Collectors.toList());

		tdList.forEach(td->System.out.println("("+td.getTrader1().getName()+","+td.getTrader2().getName()+")"));


	}
}
