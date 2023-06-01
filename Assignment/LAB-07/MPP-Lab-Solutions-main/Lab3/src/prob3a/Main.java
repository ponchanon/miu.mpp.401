package prob3a;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(5);

		System.out.println(circle.computeArea());
	}
}

//Explanation :
//	
//	Here while using the inheritance in this problem we are importing all the behaviors which
//	are not reuired for circle class so its no really good to use inheritance in here.
