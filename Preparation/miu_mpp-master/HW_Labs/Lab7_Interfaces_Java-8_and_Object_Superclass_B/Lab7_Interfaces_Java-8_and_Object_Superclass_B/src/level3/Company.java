package level3;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> deptList = new ArrayList<Department>();
	public Company(String name){
		this.name = name;
	}
	public void print() {
		System.out.printf("%s%n", "Company Name : " + name );
		for(int i = 0; i <deptList.size(); i++) {
			deptList.get(i).print();
		}
	}
	public void addDepartment(Department d) {
		deptList.add(d);
	}
}
