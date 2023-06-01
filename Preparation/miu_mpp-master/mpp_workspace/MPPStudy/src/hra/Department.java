package hra;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private String location;
	private List<Position> position;
	
	public Department(String name, String location) {
		this.name = name;
		this.location = location;
		position = new ArrayList<Position>();
	}

	public void addPosition(Position pos) {
		position.add(pos);
	}
	
	
	public double getSalary() {
		double ttlSal = 0;
		Position pos;
		for (Position p : position) {
			pos = (Position)p;
			ttlSal += pos.getSalary();
		}
		
		return ttlSal;
	}
	
	
	public void printReportingHierarchy() {
		System.out.println(getDepartmentHead());
		
		for (Position pos : position) {
			if(!(pos.equals(getDepartmentHead()))|| !(pos.getTitle().equalsIgnoreCase("CEO"))) {
				System.out.printf("\t %s \n",pos);
			}
		}
	}
	
	public Position getDepartmentHead() {
		for (Position pos : position) {
			if(pos.getTitle().equalsIgnoreCase("head")) {
				return pos;
			}
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Position> getPosition() {
		return position;
	}

	public void setPosition(List<Position> position) {
		this.position = position;
	}

	
	public void print() {
		System.out.println(toString());
		
		for (Position pos : position) {
			System.out.println(pos);
		}
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" Location: "+location;
	}
}
