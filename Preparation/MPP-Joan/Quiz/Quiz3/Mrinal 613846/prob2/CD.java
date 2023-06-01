package prob2;

public class CD extends LendingItem{
	private String productId;
	private String title;
	private String company;
	
	public CD(String productId, String title, String company) {
		this.productId = productId;
		this.title = title;
		this.company = company;
	}

	@Override
	public boolean equals(Object o){
        if (o == null) return false;
        if ( !(o instanceof CD)  ) return false;
        CD oo = (CD) o;
        return this.productId.equals(oo.productId);
    }
	
}