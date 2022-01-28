package prog2;

public class Rectangle extends ClosedCurve {
	
	private double length;
	private double width;
	@Override
	double computeArea() {
		return width * length;
	}

}
