package level1n2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {
	
	private String title;
	private String description;
	private Employee employee = null;
	
	public Position(String t, String des) {
		this.title = t;
		this.description = des;
	}
	public Position(String t, String des, Employee e) {
		this.title = t;
		this.description = des;
		this.employee = e;
	}
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void addEmployee(Employee e) {
		this.employee = e;
	}
	
	public void print() {
		System.out.printf("%s", title + " - ");
		if(employee != null) {
			employee.print();
		}else {
			System.out.printf("%s%n","[Position Vacant]");
		}
		
	}
	@Override
	public String toString() {
		return title + ", " + description; //+ ", " + "[" 
//				+ (employee != null 
//				? employee.getEmployeeId() + "," + getFirstName + (employee.getMiddleInitial() == "" ? " " 
//				+ employee.getLastName() : employee.getMiddleInitial() + " " + employee.getLastName()) : "Vacant")
//				+ "]" + "\n";
	}
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(! (p instanceof Position)) return false;
		Position pos = (Position) p;
		return pos.title.equals(this.title)
				&& pos.description.equals(this.description);
				//&& pos.employee.equals(this.employee);//cos of bi directional with employee
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, description);
	}
}
