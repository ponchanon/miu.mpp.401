package prob4c;

abstract public class Employee {
	private int empId;
	
	public Employee(int empId) {
		this.empId=empId;
	}
	
	public void print() {
		System.out.println("EmployeeId"+empId+"paycheck is as below:");
	}
	

	public PayCheck calcCompensation(int month, int year)
	{
		double grossPay=calcGrossPay(month,year);
		double fica=0.23*grossPay;
		double state=0.05*grossPay;
		double local=0.01*grossPay;
		double medicare=0.03*grossPay;
		double socialSecurity=0.075*grossPay;
		return new PayCheck(grossPay,fica,state,local,medicare,socialSecurity);
		
	}
	
	public int getEmpId()
	{
		return empId;
	}
	
	abstract public double calcGrossPay(int month,int year);
}
