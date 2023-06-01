package lab3_1;

import java.util.ArrayList;
import java.util.List;

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
}
