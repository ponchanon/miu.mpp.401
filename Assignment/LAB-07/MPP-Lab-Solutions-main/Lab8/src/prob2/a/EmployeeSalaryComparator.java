package prob2.a;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.salary == e2.salary) return 0;
		else if(e1.salary < e2.salary) return -1;
		//to be in this line the salary needs to be equal
		return e1.name.compareTo(e2.name);
	}
}
