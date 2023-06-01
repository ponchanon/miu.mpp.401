package prob2;
public class MallardDuck extends Duck{
	public MallardDuck() {
		setQuackBehaviour(new Quack());
		setFlyBehaviour(new FlyWithWings());
	}
	@Override
	public void display() {
		System.out.println("	displaying");
		
	}

}
