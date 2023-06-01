package level4;

public final class ImmutableContacts {
	
	 private final String name;
	 private final String mobile;

	    public ImmutableContacts(String name, String mobile) {
	        this.name = name;
	        this.mobile = mobile;
	    }
	  
	    public String getName(){
	        return name;
	    }
	  
	    public String getMobile(){
	        return mobile;
	    }
	    
	    //no setters

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
