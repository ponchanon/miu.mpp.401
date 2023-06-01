package prog1;

public class HealthPoints extends ACompPoints{
	private double points;
	public HealthPoints() {
		super();
		this.points = 1.0;
	}

	@Override
	public double getPoints() {
		return points;
	}
}
