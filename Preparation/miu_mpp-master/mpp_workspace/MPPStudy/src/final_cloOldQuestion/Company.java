package final_cloOldQuestion;

public class Company {
	private String companyName;
	private String companyCity;
	private String companyState;
	private double totalProfitForThisYear;
	public Company(String companyName, String companyCity, String companyState, double totalProfitForThisYear) {
		super();
		this.companyName = companyName;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.totalProfitForThisYear = totalProfitForThisYear;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public double getTotalProfitForThisYear() {
		return totalProfitForThisYear;
	}
	public void setTotalProfitForThisYear(double totalProfitForThisYear) {
		this.totalProfitForThisYear = totalProfitForThisYear;
	}
	@Override
	public String toString() {
		return String.format("%-8s %-8s %-8s %8.2f", this.companyName, this.companyCity, this.companyState, this.totalProfitForThisYear);
	}
}
