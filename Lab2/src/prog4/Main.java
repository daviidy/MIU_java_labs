package prog4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle(25, 20);
		Triangle triangle = new Triangle(12, 20);
		Circle circle = new Circle(5);
		
		System.out.println("Area of Triangle is " + triangle.computeArea());
		System.out.println("Area of Rectangle is " + rect.computeArea());
		System.out.println("Area of Circle is " + circle.computeArea());
	}

}
