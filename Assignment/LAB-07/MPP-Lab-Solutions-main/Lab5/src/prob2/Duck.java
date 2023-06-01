package prob2;



abstract public class Duck {
	private FlyBehaviour flybehaviour;
	private QuackBehaviour quackbehaviour;
	
	public void quack() {
		quackbehaviour.quack();
	}
	
	public void fly() {
		flybehaviour.fly();
	}
	
	public void swim()
	{
		System.out.println("	swimming");
	}
	
	abstract public void display();
	
	protected void setFlyBehaviour(FlyBehaviour b) {
		flybehaviour = b;
	}
	protected void setQuackBehaviour(QuackBehaviour b) {
		quackbehaviour = b;
	}
	
	
}
