package prob6;
import java.util.Comparator;
import java.util.function.*;
public class Examples {
	
	
	
	//type: Class::instanceMethod
	Function<String, String> upper = String::toUpperCase;
	//type:  Class::instanceMethod
	Function<Employee, String> eToString = Employee::getName;
	//type: Class::instanceMethod
	BiConsumer<Employee, String> setName = Employee::setName;
	//type: Class::instanceMethod
	Comparator<String> strComp = String::compareTo;
	//type: Class::staticMethod
	BiFunction<Integer, Integer, Double> min = Math::pow;
	//type: Class::instanceMethod
	Function<Apple, Double> appleWeight = Apple::getWeight;
	//type: Class::staticMethod
	Function<String, Integer> parser = Integer::parseInt;
	//type: object::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> empComp = comp::compare;
	
	public void evaluator() {
		Employee testEmp = new Employee("Mark", 50000);
		Apple testApple = new Apple(3.2);
		System.out.println(upper.apply("hello"));
		System.out.println(eToString.apply(testEmp));
		setName.accept(testEmp,"James");
		System.out.println(testEmp.getName());
		System.out.println(strComp.compare("a", "b"));
		System.out.println(min.apply(2,10));
		System.out.println(appleWeight.apply(testApple));
		System.out.println(parser.apply("15"));
		System.out.println(empComp.compare(testEmp, new Employee("Mark", 50000)));
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	@FunctionalInterface
	public interface NoArgNoReturn {
		void act();
	}
	
	
	static class Apple {
		Apple(double weight) {
			this.weight = weight;
		}
		private double weight;
		public double getWeight() {
			return weight;
		}
	}
}
