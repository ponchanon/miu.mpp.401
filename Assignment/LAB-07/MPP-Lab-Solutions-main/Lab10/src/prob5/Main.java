package prob5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class Main {

	public static String asString(Stream<Employee> emps) {
		return emps.filter(e -> e.getSalary() > 100000).filter(e -> e.getLastName().charAt(0) > 'M')
				.map(e -> fullName(e)).sorted().collect(Collectors.joining(","));
	}

	public static String asString2(Stream<Employee> emps) {
		return emps.filter(EmployeeCompanion::salaryGreaterThan100000).filter(EmployeeCompanion::lastNameAfterM)
				.map(e -> fullName(e)).sorted().collect(Collectors.joining(","));
	}

	public static Stream<Employee> loadData() {
		Stream<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				new Employee("John", "Sims", 110000), new Employee("Joe", "Stevens", 200000),
				new Employee("Andrew", "Reardon", 80000), new Employee("Joe", "Cummings", 760000),
				new Employee("Steven", "Walters", 135000), new Employee("Thomas", "Blake", 111000),
				new Employee("Alice", "Richards", 101000), new Employee("Donald", "Trump", 100000)).stream();
		return emps;
	}

	public static void main(String[] args) {
		Stream<Employee> data = loadData();
		String dataAsString = asString(data);
		System.out.println(dataAsString);

	}

	private static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}

}
