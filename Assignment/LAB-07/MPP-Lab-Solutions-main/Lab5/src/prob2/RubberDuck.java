package prob2;
public class RubberDuck extends Duck {
	public RubberDuck() {
		setQuackBehaviour(new Squeak());
		setFlyBehaviour(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("	displaying");
		
	}
}
