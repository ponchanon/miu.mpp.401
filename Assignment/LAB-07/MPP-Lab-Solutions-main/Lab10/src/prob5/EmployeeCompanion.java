package prob5;

import java.util.function.Predicate;

public class EmployeeCompanion {
	static Predicate<Employee> empCompSalary = e -> (e.getSalary() > 100000);

	static Predicate<Employee> empCompLastName = e -> (e.getLastName().charAt(0) > 'M');

	public static boolean salaryGreaterThan100000(Employee e) {
		return empCompSalary.test(e);
	}

	public static boolean lastNameAfterM(Employee e) {
		return empCompLastName.test(e);
	}
}
