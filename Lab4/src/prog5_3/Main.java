package prog5_3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"cat", "book", "computer"};
		StringSort str = new StringSort(new StringLengthComparator());
				
		System.out.println(Arrays.toString(str.stringSort(s)));
	}

}
