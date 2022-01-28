package prog2;

public class Prog2 {

	public static void main(String[] args) {
	 int x = RandomNumbers.getRandomInt(1, 9);
	 double res1 = Math.pow(Math.PI, x);
	 System.out.println(res1);
	 int y = RandomNumbers.getRandomInt(3, 14);
	 double res2 = Math.pow(y, Math.PI);
	 System.out.println(res2);
	}

}
