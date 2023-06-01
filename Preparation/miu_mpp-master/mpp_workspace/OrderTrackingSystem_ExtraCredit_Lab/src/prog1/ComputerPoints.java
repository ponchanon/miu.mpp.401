package prog1;

public class ComputerPoints extends ACompPoints {
	private double points ;
	public ComputerPoints() {
		super();
		this.points = 2.0;
	}
	@Override
	public double getPoints() {
		return points;
	}
}
