package prob4c;

public class Salaried extends Employee{
	private double salary;
	public Salaried(int empId, double salary) {
		super(empId);
		this.salary=salary;
		
	}
	

	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Salary Information for employee with Employee ID: " + super.getEmpId());
		System.out.println("Employee Type: Salaried Salary Worker");
	}

	@Override
	public double calcGrossPay(int month, int year) {
		
		return ((year*12)+month)*salary;
	}

}
