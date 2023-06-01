package prob2;

public class RedheadDuck extends Duck{
	
	public RedheadDuck()
	{
		setQuackBehaviour(new Quack());
		setFlyBehaviour(new FlyWithWings());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("	displaying");
		
	}

}
