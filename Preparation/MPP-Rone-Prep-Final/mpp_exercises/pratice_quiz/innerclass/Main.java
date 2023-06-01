 package innerclass;

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

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		class LengthOfNameAndYearBirth implements Predicate<Employee>{
			@Override
			public boolean test(Employee e) {
				return e.getName().length() > 5 && e.getYearOfBirth() > 1970;
			}
			
		}
		
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		sampleData.stream().filter(new LengthOfNameAndYearBirth())
		.toList().forEach(System.out::println);
				
		//prob1();
		//prob2();
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type 
	public static void prob1() {
		//use this list 
		System.out.println("problem 1:");
		List<Employee> list = EmployeeTestData.getList();
		list.stream().filter(new EmployeeWithSalaryGreaterAndLess())
		.sorted(new SortedEmployeeByNameThenBySalaryReverse() )
		.map(e -> new Pair(e.getName(), e.getSalary()))
		.toList().forEach(System.out::println);
		
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		System.out.println(" =============== prob2 ============ ");
		List<Transaction> list = TraderTransactTestData.getTransactions();
		list.stream().filter(new TransactionsTookPlaceInYear())
		.sorted(new SortedTransactionByValue())
		.toList().forEach(System.out::println);
		
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		System.out.println("================= prob3 ================");
		List<Transaction> list = TraderTransactTestData.getTransactions();  
		Util.allTraderPairs(list.stream().map(t -> t.getTrader()))
		.filter(new ListTradersAssociateSameCity()).distinct()
		.sorted(new SortedTradersAssociateSameCity()).toList()
		.forEach(System.out::println);
	                
	}
	

	static class EmployeeWithSalaryGreaterAndLess implements Predicate<Employee>{
			@Override
			public boolean test(Employee e) {
				return e.getSalary() > 55000 && e.getSalary() < 120000;
			}
		}
	static class SortedEmployeeByNameThenBySalaryReverse implements Comparator<Employee>{
		@Override
		public int compare(Employee e1, Employee e2) {
			if(e1.getName().compareTo(e2.getName()) == 0) {
				if((e1.getSalary() < e2.getSalary())) return 1;
				else if(e1.getSalary() > e2.getSalary()) return -1;
				else return  0;
			}else return e1.getName().compareTo(e2.getName());
		}
	}
	
	static class TransactionsTookPlaceInYear implements Predicate<Transaction>{
		@Override
		public boolean test(Transaction t) {
			return t.getYear() == 2011;
		}
	}
	
	static class SortedTransactionByValue implements Comparator<Transaction>{
		@Override
		public int compare(Transaction t1, Transaction t2) {
			if(t1.getValue() > t2.getValue()) return 1;
			if(t1.getValue() < t2.getValue()) return -1;
			else return 0;
		}
	}
	
	static class ListTradersAssociateSameCity implements Predicate<TraderPair> {
		@Override
		public boolean test(TraderPair t) {
			return t.getTrader1().getCity().equals(t.getTrader2().getCity());
		}
	}
	static class SortedTradersAssociateSameCity implements Comparator<TraderPair> {
		@Override
		public int compare(TraderPair t1, TraderPair t2) {
			if(t1.getTrader1().getName().compareTo(t2.getTrader1().getName()) == 0)
				return t1.getTrader2().getName().compareTo(t2.getTrader2().getName());
			else return t1.getTrader1().getName().compareTo(t2.getTrader1().getName());
		}
	}
}
