package prog4;

public final class Triangle {
	private final double base;
	private final double height;
	private final double third;
	
	
	
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
		this.third = 0;
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.base = side1;
		this.height = side2;
		this.third = side3;
	}


	public double getBase() {
		return base;
	}


	public double getHeight() {
		return height;
	}


	public double computeArea() {
		return (1/2) * base * height;
	}

}
