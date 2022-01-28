package prog3;

public class Prog3 {

	public static void main(String[] args) {
		float x = 1.27f;
		float y = 3.881f;
		float z = 9.6f;
		
		float sum = x + y + z;
		int intSum = (int)(sum);
		System.out.println(intSum);
		
		int roundSum = Math.round(sum);
		System.out.println(roundSum);

	}

}
