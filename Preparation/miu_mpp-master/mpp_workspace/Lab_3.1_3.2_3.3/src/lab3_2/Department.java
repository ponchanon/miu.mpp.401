package lab3_2;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private String location;
	private List<Position> posList = new ArrayList<Position>();
	
	public Department(String name, String location){
		this.name = name;
		this.location = location;
	}	
	public void addPosition(Position p) {
		posList.add(p);
	}
	public void print() {
		System.out.printf("%s%n", "Department : " + name + " located at " + location );
		for(int i = 0; i <posList.size(); i++) {
			posList.get(i).print();
		}
	}
	//total Department salary - summation of each filled position in department
	public double getSalary() {
		double sumSalary = 0.0;
		for(int i = 0; i <posList.size(); i++) {
			sumSalary += posList.get(i).getSalary();
		}
		System.out.println("Total Salary of " + name + " Department : " + sumSalary);
		return sumSalary;
	}
}
