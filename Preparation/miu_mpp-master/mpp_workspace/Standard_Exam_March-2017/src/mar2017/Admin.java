package mar2017;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double sumBalance = 0.0;
		for(Employee e : list) {
			sumBalance += e.computeUpdatedBalanceSum();
		}
		return sumBalance;
	}
}
