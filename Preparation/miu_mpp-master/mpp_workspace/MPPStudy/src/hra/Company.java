package hra;

import java.util.ArrayList;
import java.util.List;

public class Company {

	private String name;
	private List<Department> departments;
	
	public Company(String name) {
		this.name = name;
		departments = new ArrayList<Department>();
	}

	
	public Position getTopExcutive() {
		
		for (Department department : departments) {
			
			for (Position pos : department.getPosition()) {
			
				if(pos.isManager()) {
					return pos;
				}
			}
		}
		
		return null;
	}
	
	public void printReportingHierarchy() {
		
		System.out.printf("CEO: %s \n",getTopExcutive());
	
		for (Department dep : departments) {
			System.out.printf("\t %s \n",dep);
				dep.printReportingHierarchy();
		}
	}
	
	public void addDepartment(Department dep) {
		departments.add(dep);
	}
		
	public double getSalary() {
		double ttlSal =0;
		for(Department department : departments) {
			Department dep = (Department)department;
			ttlSal +=dep.getSalary();  // delegation 	
		}
		return ttlSal;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}
	
//	propagation 
//	calling another method in side a method. 
	public void print() {
		System.out.println(toString());
		
		for (Department dep : departments) {
			System.out.println(dep);
		}
	}

	@Override
	public String toString() {
		return "name: "+name;
	}
}
