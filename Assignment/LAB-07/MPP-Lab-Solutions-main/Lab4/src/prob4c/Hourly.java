package prob4c;

public class Hourly extends Employee{
	private double hourlyWage;
	private double hoursPerWeek;
	public Hourly(int empId,double hourlyWage, double hoursPerWeek) {
		super(empId);
		this.hourlyWage=hourlyWage;
		this.hoursPerWeek=hoursPerWeek;
		// TODO Auto-generated constructor stub
	}


	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Salary Information for employee with Employee ID: " + super.getEmpId());
		System.out.println("Employee Type: Hourly Salary Worker");
	}

	@Override
	public double calcGrossPay(int month, int year) {
		int weeks=((year*12)+month)*4;
		return weeks*hourlyWage*hoursPerWeek;
	}

}
