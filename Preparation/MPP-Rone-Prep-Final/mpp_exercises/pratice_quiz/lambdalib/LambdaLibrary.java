package lambdalib;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import quizclasses.Employee;
import quizclasses.Pair;
import quizclasses.Trader;
import quizclasses.TraderPair;
import quizclasses.Transaction;
import quizclasses.Util;


public class LambdaLibrary {
	public final static String IMPLEMENT = "implement!";
	
	//sample query
	public final static TriFunction<List<Employee>, Integer, Integer, List<Employee>> SAMPLE
	   = (list, namelength, year) -> list.stream()
	                                     .filter(e -> e.getName().length() > namelength)
	                                     .filter(e -> e.getYearOfBirth() > year)
	                                     .collect(Collectors.toList());
	   
	//prob01
	public final static TriFunction<List<Employee>, Double, Double, List<Pair>> IMPLEMENT_PROB1 =
			   (list, minSalary, maxSalary) -> list.stream()
			   .filter(e -> e.getSalary() > minSalary && e.getSalary() < maxSalary)
			   .sorted(Comparator.comparing(Employee::getName)
					   .thenComparing(Employee::getSalary,Comparator.reverseOrder()))
			   .map(e -> new Pair(e.getName(), e.getSalary())).toList();
			   
//prob2
public final static BiFunction<List<Transaction>, Integer, List<Transaction>> IMPLEMENT_PROB2 =
	(list, year) -> list.stream().filter(t -> t.getYear() == year)
				.sorted(Comparator.comparing(Transaction::getValue)).toList();

			 

//prob3
	//public final static BiFunction<Stream<TraderPair>, Trader, List<Trader>> IMPLEMENT_PROB3 =
			
			//(stream, trade) -> stream.
			/*(list, trade) -> Util.allTraderPairs(list.stream().map(t -> t.getTrader()))
			.filter(p -> p.getTrader1().getCity().equals(p.getTrader2().getCity()))
			.distinct()
			.sorted(Comparator.comparing((TraderPair p) -> p.getTrader1().getName())
					.thenComparing(p -> p.getTrader2().getName()))
			.toList();*/
}
