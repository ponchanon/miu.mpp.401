package level2_no5_redo_school_lab2_level1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Person{
	private double salary;
	private List<Course> courses = new ArrayList<Course>();
	

	Faculty(String name, String phone, int age, double salary) {
		super(name, phone, age);
		this.salary = salary;
	}	
	public int getTotalUnits() {
		//int sumUnits = 0;
		//----------------
		// lambda & stream
		//----------------	
		return courses.stream().mapToInt(Course::getUnits).sum();
//		for(Course c: courses) {
//			sumUnits += c.getUnits();
//		}
//		return sumUnits;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	@Override
	public double getSalary() {
		return salary;
	}

}
