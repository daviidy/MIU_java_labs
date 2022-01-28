package prog8;

public class Prog8 {
	
	static int min(int[] arrayOfInts) {
		int min = 0;
		for (int i = 0; i < arrayOfInts.length; i++) {
			if (arrayOfInts[i] < min) {
				min = arrayOfInts[i];
			}
		}
		return min;
	}

}
