package level2;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private List<Person> persons;//unidirectional, 0 to many 	
	
	Department(String name){
		this.name = name;
		persons= new ArrayList<Person>();
	}
	public double getTotalSalary() {
		double sumSalary = 0.0;
		//polymorphism
		//computes the sum of all the salaries (per month) paid to faculty and staff.
		//lambda
//		persons.forEach(person -> {
//				if(!(person.getClass().getSimpleName().equals("Student"))) sumSalary += person.getSalary();
//		});	
		
		//instanceof
		for(Person p : persons) {
			if(p instanceof Staff || p instanceof StaffStudent || p instanceof Faculty) {//note* cannot do !(p instanceof Student) //as staffstudent is the child of student
				sumSalary += p.getSalary();
			}
		}
		return sumSalary;
	}
	public void showAllMembers() {
		// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
		persons.forEach(person -> System.out.println(person.name + "," + person.phone + "," + person.age + "," + person.getClass().getSimpleName()));
	}
	public void unitsPerFaculty() {
		//shows a list of all faculty names and the total number of units they teach.  
		//For unitsPerFaculty()  do it two different ways.  One is use  instanceOf, and the other is use   getClass().getSimpleName()
		//lambda
		persons.forEach(person -> {
			if(person.getClass().getSimpleName().equals("Faculty")) {
				System.out.println(person.name + " : " + ((Faculty)person).getTotalUnits());
			}
		});	
		
		
	}	
	public void addPerson(Person p) {
		persons.add(p);
	}
	public void showAllStudentsNCourses(){
		//lambda
//		persons.forEach(person ->{			
//			if(person.getClass().getSimpleName().equals("Student") || person.getClass().getSimpleName().equals("StaffStudent")) {
//				((Student)person).showCourses();
//			}
//		});
		//for each
		for(Person person: persons) {
			if(person instanceof Student  && person instanceof StaffStudent) {
				Student s1 = (Student) person;
				s1.showCourses();
			}
		}
	}
}
