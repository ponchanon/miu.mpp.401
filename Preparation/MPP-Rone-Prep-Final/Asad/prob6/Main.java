package Exam.Asad.prob6;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager("Sujit",600000,LocalDate.of(2016, 1, 1),null);
		LeadEngineer l = new LeadEngineer("Sujit",6000,LocalDate.of(2016, 1, 1),null);
		
		System.out.println("Manager salary: " + m.getSalary());
		System.out.println("Lead Engineer salary: " + l.getSalary());
	}

}
