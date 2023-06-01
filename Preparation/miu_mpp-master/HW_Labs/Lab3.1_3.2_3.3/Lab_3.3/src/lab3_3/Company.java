package lab3_3;

import java.util.ArrayList;
import java.util.List;

public class Company {
	private String name;
	private List<Department> deptList = new ArrayList<Department>();
	
	public Company(String name){
		this.name = name;
	}	
	public void addDepartment(Department d) {
		deptList.add(d);
	}
	public void print() {
		System.out.printf("%s%n", "Company Name : " + name );
		for(int i = 0; i <deptList.size(); i++) {
			deptList.get(i).print();
		}
	}
	public double getSalary() {
		double sumSalary = 0.0;		
		for(int i = 0; i <deptList.size(); i++) {
			sumSalary += deptList.get(i).getSalary();
		}
		System.out.printf("%s", "Total Salary of " + name + " Company is " + sumSalary);
		return sumSalary;
	}
	
	public void printReportingHierarchy() {
		//1.getTopExecutive
		Position posTopExe = getTopExecutive();		
		posTopExe.print();
		
		//2.getDeptHead
		//3.print that department hierarchy
		for(Department d: deptList) {
			Position dHead = d.getDepartmentHead();
			if(dHead!= null) {
				System.out.printf("%s", "  ");
				dHead.print();		
			}
			d.printReportingHierarchy();
		}
		

	}
	public Position getTopExecutive() {
		//topExec Position is inside department "Top"
		List<Position> newPosList = new ArrayList<Position>();		
		
		for(Department dp: deptList) {
			if(dp.getName().equals("Top")) {
				newPosList = dp.getPositionListInDepartment();
			}
		}		
		//assume only one top executive in company
		return newPosList.get(0);
	}
	
}
