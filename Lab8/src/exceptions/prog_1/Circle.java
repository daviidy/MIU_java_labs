package exceptions.prog_1;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius){
		this(radius.doubleValue());
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}
