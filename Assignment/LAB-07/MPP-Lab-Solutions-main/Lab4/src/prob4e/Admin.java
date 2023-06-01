package prob4e;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sum = 0.0;
		
		for(Employee emps: list)
		{
			sum += emps.computeUpdatedBalanceSum();
		}
		
		return sum;
	}
}
