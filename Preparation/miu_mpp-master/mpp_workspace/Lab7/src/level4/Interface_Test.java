package level4;

public class Interface_Test {
	public static void main(String[] args) {
		Person p1 = new Person("John", "641-819-2000", 50);
		p1.myDefault();
		IPerson.myStatic();
		p1.myAbstract();
	}
}
