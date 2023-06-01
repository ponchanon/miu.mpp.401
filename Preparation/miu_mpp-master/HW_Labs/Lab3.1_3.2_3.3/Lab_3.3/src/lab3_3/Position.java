package lab3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Position {
	private String title;
	private String description;
	private Employee employee = null;	
	private Position manager = null;
	private Department department;
	private List<Position> inferiorList = new ArrayList<Position>();		
	
	public Position(String t, String des, Department d, Position superior) {
		this.title = t;
		this.description = des;
		this.department = d;
		this.manager = superior;
	}
	public Position(String t, String des, Position superior, Employee e) {
		this.title = t;
		this.description = des;
		this.employee = e;
		this.manager = superior;
	}
	public Department getDepartment() {
		return department;
	}
	public void addEmployee(Employee e) {
		this.employee = e;
	}
	public void addInferiorList(ArrayList<Position> pList) {
		inferiorList = pList;
		
	}
	public List<Position> getInferiorListInPosition(){
		return inferiorList;
	}
	public String getTitle() {
		return title;
	}
	public Position getManager() {
		return manager;
	}
	
	public void print() {
		//System.out.printf("%s", title + " - ");
		if(employee != null) {
			employee.print();
		}else {
			System.out.printf("%n","");
		}
		
	}
	//salary of position where employee filled, not vacant position
	public double getSalary() {
		return (employee != null ? employee.getSalary() : 0);	
	}
	public void printDownLine() {
		if(inferiorList != null && inferiorList.size()!=0) {
			for(Position p : inferiorList) {
				System.out.printf("%s", "     ");
				p.employee.print();
			}
		}	
	}
	public boolean isManager() {//means it has inferior list
		if(inferiorList != null && inferiorList.size()!=0) return true;
		else return false;		
	}
	
	@Override
	public boolean equals(Object p) {
		if(p == null) return false;
		if(! (p instanceof Position)) return false;
		Position pos = (Position) p;
		return pos.title.equals(this.title)
				&& pos.description.equals(this.description);				
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(title, description);
	}
}
