package prob4c;

public class PayCheck {

	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	

	
public PayCheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
		
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}



	public void print()
	{
		System.out.println("Details: ");
		System.out.println("---------------------------------------------------");
		System.out.println("Gross Amount : $" + grossPay);
		System.out.println("FICA : $" + fica);
		System.out.println("State : $" + state );
		System.out.println("Local : $" + local );
		System.out.println("Medicare : $" + medicare);
		System.out.println("Social Security : $" + socialSecurity);
		System.out.println("---------------------------------------------------");
		System.out.println("Net Amount: " + getNetPay());
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	
	public double getNetPay()
	{
		return grossPay-(fica+state+local+medicare+socialSecurity);
	}
	
}
