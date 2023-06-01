 package Quiz4.innerclass;

 import Quiz4.quizclasses.*;

 import java.util.ArrayList;
 import java.util.Comparator;
 import java.util.List;
 import java.util.function.Function;
 import java.util.function.Predicate;
 import java.util.stream.Collectors;

/** SOLVE THE PROBLEMS HERE BY REPLACING LAMBDA EXPRESSIONS IN YOUR PIPELINE SOLUTIONS 
 *  WITH LOCAL INNER CLASSES
 *
 */
public class Main {
	public static void main(String[] args) {
		
		//SAMPLE: Use local inner classes to replace lambdas in your pipeline solution to 
		//this sample problem:
		//Print all Employee records for which name has length > 5 and birth year is > 1970
		
		class NameLength implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getName().length() > 5;
			}
		}
		class BirthYear implements Predicate<Employee> {
			public boolean test(Employee e) {
				return e.getYearOfBirth() > 1970;
			}
		}
		System.out.println("Sample Query");
		List<Employee> sampleData = EmployeeTestData.getList();
		
		List<Employee> result = sampleData.stream()
							        .filter(new NameLength())
							        .filter(new BirthYear())
							        .collect(Collectors.toList());
		System.out.println(result);


		System.out.println();
		System.out.println("Problem1 solution: ");
		prob1();

		System.out.println();
		System.out.println("Problem2 solution: ");
		prob2();

		System.out.println();
		System.out.println("Problem3 solution: ");
		prob3();
	}
	
	//Transform your pipeline solution to prob1 in the pipeline package so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob1() {
		//use this list 
		List<Employee> list = EmployeeTestData.getList();
		List<Pair> pairList=new ArrayList<>();
		for(Employee emp:list) {
			pairList.add(new Pair(emp.getName(), emp.getSalary()));
		}


		class SalaryCondition implements Predicate<Pair>{

			@Override
			public boolean test(Pair t) {
				// TODO Auto-generated method stub
				if(t.salary>50000 && t.salary<120000) {
					return true;
				}
				return false;
			}

		}
		class NameComparator implements Comparator<Pair> {

			@Override
			public int compare(Pair p1, Pair p2) {
				if(p1.name.compareTo(p2.name)>0) return 1;
				else if(p1.name.compareTo(p2.name)<0) return -1;
				else return 0;
			}

		}

		class SalaryComparator implements Comparator<Pair>{

			@Override
			public int compare(Pair p1, Pair p2) {
				if(p1.salary>p2.salary) return -1;
				else if(p1.salary<p2.salary) return 1;
				else return 0;
			}

		}
		pairList.stream().filter(s->new SalaryCondition().test(s))
				.sorted(new NameComparator()).sorted(new SalaryComparator())
				.forEach(s->System.out.println(s));
		
	}
	
	///Transform your pipeline solution to prob2 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob2() {
		//use this list	
		List<Transaction> list = TraderTransactTestData.getTransactions();
		class Filter implements Predicate<Transaction>{
			public boolean test(Transaction trans) {
				if (trans.getYear()>=2011) {
					return true;
				}
				return false;
			}
		}

		class ValueComparator implements Comparator<Transaction>{

			@Override
			public int compare(Transaction o1, Transaction o2) {
				if(o1.getValue()>o2.getValue()) {
					return 1;
				}else if (o1.getValue()<o2.getValue()) {
					return -1;
				}else {
					return 0;
				}
			}

		}

		list.stream()
				.filter(s->new Filter().test(s))
				.sorted(new ValueComparator())
				.forEach(s->System.out.println(s));
	}
	
	//Transform your pipeline solution to prob3 so that
	//every lambda is replaced by an instance of a
	//local inner class of the correct type
	public static void prob3() {
		//Use this list
		class TransToTrader implements Function<Transaction, Trader> {
			public Trader apply(Transaction t) {
				return t.getTrader();
			}
		}
		class CityPredicate implements Predicate<TraderPair> {
			public boolean test(TraderPair p) {
				return p.getTrader1().getCity().equals(p.getTrader2().getCity());
			}
		}
		class AssociatePredicate implements Predicate<TraderPair> {
			public boolean test(TraderPair p) {
				return p.getTrader1().isAssociate(p.getTrader2());
			}
		}
		List<Transaction> list = TraderTransactTestData.getTransactions();

		System.out.println(
				Util.allTraderPairs(list.stream().map(new TransToTrader())  )
						.filter(new CityPredicate())
						.filter(new AssociatePredicate())
						.distinct()
						.collect(Collectors.toList()));
	                
	}
}
