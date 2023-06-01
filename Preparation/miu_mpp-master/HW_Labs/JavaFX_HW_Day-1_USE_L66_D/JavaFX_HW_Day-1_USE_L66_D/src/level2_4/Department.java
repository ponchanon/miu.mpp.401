package level2_4;

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
		
		//for each
		for(Person p : persons) {
			if(!(p instanceof Student)) {
				sumSalary += p.getSalary();
			}
		}
		return sumSalary;
	}
	public String showAllMembers() {
		// shows the name, phone number, age and type (student, faculty or staff) of all members in the department.
		String output = "";
		for(Person person: persons) {
			output += person.name + ", " + person.phone + ", " + person.age + ", " + person.getClass().getSimpleName()+ "\n";
		}
		return output;
	}
	public String unitsPerFaculty() {
		String output="";
		for(Person person: persons) {
			if(person.getClass().getSimpleName().equals("Faculty")) {
				output += person.name + " : " + ((Faculty)person).getTotalUnits() + " unit(s)\n";
			}
		}
		return output;
//		persons.forEach(person -> {
//			if(person.getClass().getSimpleName().equals("Faculty")) {
//				System.out.println(person.name + " : " + ((Faculty)person).getTotalUnits());
//			}
//		});		
	}	
	public void addPerson(Person p) {
		persons.add(p);
	}
	
	public String showAllStudentsOfAFacultyMember(String facName) {
		//get facName's courses
		List<Course> facCourses = new ArrayList<Course>();
		for(Person p : persons) {
			if(p instanceof Faculty) {
				if(p.name.equals(facName)) {
					facCourses = ((Faculty)p).getCourses();
				}
			}
		}		
		//find students who take fac member courses
		//System.out.println("List of students who take " + facName + " classes : ");
		String output= "";
		for(Person per : persons) {
			if(per instanceof Student) {
				//check this student is taken any of the facCourses
				if (((Student)per).isTakenFacultyCourses(facCourses)) {
					output += per.name + "\n";
				}
			}
		}
		return output;
	}
	
	public void showAllStudentsNCourses(){
		persons.forEach(person ->{			
			if(person.getClass().getSimpleName().equals("Student") || person.getClass().getSimpleName().equals("StaffStudent")) {
				((Student)person).showCourses();
			}
		});
	}
}
