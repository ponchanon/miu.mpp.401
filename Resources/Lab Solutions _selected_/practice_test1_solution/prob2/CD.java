package prob2;

public class CD extends LendingItem {
	
	private String productId;
	private String title;
	private String company;
	public CD(String prodId, String title, String company) {
		this.productId = prodId;
		this.title = title;
		this.company = company;
	}
	public String getProductId() {
		return productId;
	}
	public String getTitle() {
		return title;
	}
	public String getCompany() {
		return company;
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof CD)) return false;
		CD cd = (CD)ob;
		return cd.productId.equals(productId) && cd.title.equals(title) && cd.company.equals(company);
	}
	
}
