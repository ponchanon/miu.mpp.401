package hra;

import java.time.LocalDate;

public class Employee {

	private int employeeId;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private LocalDate localDate;
	private String sSN;
	private double salary;
	private Position position;
	
	public Employee(int employeeId, String firstName, String middleInitial, String lastName, LocalDate localDate,
			String sSN, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.localDate = localDate;
		this.sSN = sSN;
		this.salary = salary;
	}
	
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	public String getsSN() {
		return sSN;
	}
	public void setsSN(String sSN) {
		this.sSN = sSN;
	}
	
//	Lab 3.2
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String print() {
		return toString() + position;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", middleInitial=" + middleInitial
				+ ", lastName=" + lastName + ", localDate=" + localDate + ", sSN=" + sSN + ", salary=" + salary
				+  "]";
	}
	
	
	
	
	
	
	
}
