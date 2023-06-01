package prob2;
public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setQuackBehaviour(new MuteQuack());
		setFlyBehaviour(new CannotFly());
	}
	@Override
	public void display() {
		System.out.println("	displaying");
		
	}
}
