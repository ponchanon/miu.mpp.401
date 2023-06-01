package prob5.solution1;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.*;

import prob5.Main;
import prob5.Employee;

public class TestFac {

	public static Stream<Employee> loadData() {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), new Employee("Donald", "Trump", 100000)).stream();
		return emps;
	}

	@Test
	public void testAsList() {
		String actualResult = "Alice Richards,Joe Stevens,John Sims,Steven Walters";
		Stream<Employee> data = loadData();
		String endResult = Main.asString(data);
		assert(actualResult.compareTo(endResult) == 0);
	}
}
