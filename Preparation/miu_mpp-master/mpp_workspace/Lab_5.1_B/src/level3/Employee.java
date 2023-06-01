package level3;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	private String empId;
	private List<Paycheck> payCheckList = new ArrayList<Paycheck>();
		
	public Employee(String empId) {
		super();
		this.empId = empId;
	}
	
	public void print() {
		String output;
		output = String.format("%1$-10s", "Employee ID : " );
		output += String.format("%s", empId );
		//output += String.format("%n%s", "Emp Type: " + this.getClass().getSimpleName());
		System.out.println(output);
		
		//level 3 - only 8,2015 order result
		calcCompensation(8, 2015).print();
		
	}	
	
	public Paycheck calcCompensation(int month, int year) {

		double grossPay = calcGrossPay(month, year);
		Paycheck pc = new Paycheck(grossPay, month, year,this);
		payCheckList.add(pc);
		return pc;
		
		
	}
	public abstract double calcGrossPay(int month, int year);
	
}
