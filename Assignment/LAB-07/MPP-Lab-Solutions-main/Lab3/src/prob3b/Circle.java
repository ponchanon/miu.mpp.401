package prob3b;

public class Circle {
	Cylinder cylinder;

	public Circle(double radius) {
		cylinder = new Cylinder(0, radius);
	}

	public double computeArea() {
		return Math.PI * Math.pow(cylinder.getRadius(), 2);
	}

}
