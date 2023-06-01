package level3;

import java.time.LocalDate;

public class StaffStudent extends Student{
	private Staff staff;
	private double salary;
	private LocalDate firstCourseStartDate = null;

	StaffStudent(String name, String phone, int age, double gpa, double salary) {
		super(name, phone, age, gpa);
		this.salary = salary;
		staff = new Staff(name, phone, age, salary);
	}
	@Override
	public double getSalary() {
		return staff.getSalary();
	}
	@Override
	public void addCourse(Course c) {		
		super.addCourse(c);
		if(firstCourseStartDate == null) {
			firstCourseStartDate = LocalDate.now();
		}
	}
}
