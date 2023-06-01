package hra;


import java.util.List;

public class Position {

	private String title;
	private String discription;
	private Employee employee;
	private Position superior;
	private List<Position> infarior;
	public Position(String title, String discription) {
		this.title = title;
		this.discription = discription;
	}
	
	public boolean isManager() {
		if(employee == null) return false;
		return (employee.getPosition().getTitle().equalsIgnoreCase("CEO"))? true : false; 
	}
	
	public Position getSuperior() {
		return superior;
	}


	public void setSuperior(Position superior) {
		this.superior = superior;
	}


	public List<Position> getInfarior() {
		return infarior;
	}



	public void setInfarior(List<Position> infarior) {
		this.infarior = infarior;
	}
	

	public double getSalary() {
		return employee.getSalary(); // delegation
	}
	
	public void printDownLine() {
		System.out.println(superior);
		for (Position inf : infarior) {
			System.out.printf("\t %s \n",inf);
		}
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	public String print() {
		return this.toString() + employee.print();
	}
	@Override
	public String toString() {
		return " Title: "+title+" Discription: "+discription ;
	}
	
	
	
}
