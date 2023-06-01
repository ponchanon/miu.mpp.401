package Exam.Asad.prob6;

import java.time.LocalDate;
import java.util.List;


public class LeadEngineer extends Employee implements Default {
	private List<Project> projects;
	public LeadEngineer(String name, double salary, LocalDate hireDate, List<Project> projects) {
		super (name,salary,hireDate);
		this.projects = projects;		
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() + computeBonus();
	}
}
