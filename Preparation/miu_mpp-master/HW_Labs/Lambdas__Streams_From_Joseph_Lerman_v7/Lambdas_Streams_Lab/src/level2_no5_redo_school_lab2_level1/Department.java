package level2_no5_redo_school_lab2_level1;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private List<Person> persons;//0 to many relationship 	
	
	Department(String name){
		this.name = name;
		persons= new ArrayList<Person>();
	}
	public double getTotalSalary() {
		//----------------
		// lambda & stream
		//----------------
		//computes the sum of all the salaries (per month) paid to faculty and staff.
		return persons.stream()
			.mapToDouble(Person::getSalary)
			.sum();		

	}
	public void showAllMembers() {		
		//----------------
		// lambda & stream
		//----------------		
		persons.stream()
			.forEach(p -> System.out.printf("%s%n", p.name + "," + p.phone + "," + p.age + "," + p.getClass().getSimpleName()));

	}
	public void unitsPerFaculty() {
		//shows a list of all faculty names and the total number of units they teach.  		
		//----------------
		// lambda & stream
		//----------------	
		persons.stream().filter(p -> p instanceof Faculty)
			.forEach(p-> System.out.println(p.name + " : " + ((Faculty)p).getTotalUnits()));

	}	
	void addPerson(Person p) {
		persons.add(p);
	}
}
