package level4;

public class Immutable_Test {

	public static void main(String[] args) {
		ImmutableContacts c = new ImmutableContacts("Ariel", "641-819-0000");
		System.out.println(c.getName() + " " + c.getMobile());		

	}

}
