package level2_no5_redo_school_lab2_level1;

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
		//----------------
		// lambda & stream
		//----------------
		return courses.stream().mapToInt(Course::getUnits).sum();
		
//		int sumUnits = 0;
//		for(Course c : courses) {
//			sumUnits += c.getUnits();
//		}		
//		return sumUnits;
	}
	public void addCourse(Course c) {
		courses.add(c);
	}
		
}
