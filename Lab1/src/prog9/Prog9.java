package prog9;

public class Prog9 {
	
	public static void main(String[] args){
		String output1 = "";
		String output2 = "";
		output1 = String.format("%16d %12d %12d %12d %n %n %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
		output1 += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
		output1 += String.format("%16s %12s %12s %12s %n %n %n %n","____", "____", "____", "____");
		System.out.println(output1);
		
		output2 = String.format("%16d %12d %12d %12d %n %n %n %n", RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99), RandomNumbers.getRandomInt(1, 99));
		output2 += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99), "+", RandomNumbers.getRandomInt(1, 99));
		output2 += String.format("%16s %12s %12s %12s","____", "____", "____", "____");
		System.out.println(output2);
	}

}
