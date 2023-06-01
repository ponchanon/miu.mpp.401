package level2_4;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private double gpa;
	private List<Course> courses = new ArrayList<Course>();	
	
	Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.gpa = gpa;
	}
	public int getTotalUnits() {
		int sumUnits = 0;
		for(Course c : courses) {
			sumUnits += c.getUnits();
		}		
		return sumUnits;
	}
	public void addCourse(Course c) {
		courses.add(c);
	}
	public ArrayList<Course> getCourses(){
		return (ArrayList<Course>) courses;
	}
	
	public boolean isTakenFacultyCourses(List<Course> facCourses) {
		for(Course fc : facCourses) {
			for(Course c : courses) {
				if(fc.equals(c)) {
					return true;
				}
			}
		}
		return false;
	}
	public void showCourses() {
		System.out.print(this.name + "-");
		courses.forEach(c -> System.out.print(c.getCourseNumber() + ","));
		System.out.println("");
	}
		
}
