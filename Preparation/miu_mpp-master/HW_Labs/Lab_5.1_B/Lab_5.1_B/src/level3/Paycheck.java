package level3;

import java.time.LocalDate;

//immutable
public class Paycheck {
	
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private LocalDate payPeriod;
	private Employee employee;
	//
	
	public Paycheck(double grossPay, int month, int year, Employee employee) {
		super();
		this.grossPay = grossPay;
		this.fica = grossPay * .23;//values shoudn't come from other
		this.state = grossPay * .05;
		this.local = grossPay * .01;		
		this.medicare = grossPay * .03;
		this.socialSecurity = grossPay * 0.075;		
		this.payPeriod = LocalDate.of(year, month, 25);
		this.employee = employee;
	}		

	public void print() {
		System.out.printf("%s%n", "Pay Period : " + payPeriod.toString());
		System.out.printf("%s", "Gross Pay : ");
		System.out.printf("$%-9.2f%n",  grossPay);
		System.out.printf("%s%n", "FICA : " + fica * 100 + "%");
		System.out.printf("%s%n", "State : " + state* 100 + "%");
		System.out.printf("%s%n", "Local : " + local* 100 + "%");
		System.out.printf("%s%n", "Medicare : " + medicare* 100 + "%");
		System.out.printf("%s%n", "Social Security : " + socialSecurity* 100 + "%");
		System.out.printf("%s", "Net Pay : ");
		System.out.printf("$%-9.2f%n", getNetPay());		
	}
	public double getNetPay() {		
		return grossPay - (fica + state + local + medicare + socialSecurity);
	}
}
