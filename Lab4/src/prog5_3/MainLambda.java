package prog5_3;

import java.util.Arrays;

public class MainLambda {
	public static void main(String[] args) {
		String[] s = {"cat", "book", "computer"};
		
		StringSort str = new StringSort((String o1, String o2) -> o1.length() - o2.length());
		
		System.out.println(Arrays.toString(str.stringSort(s)));
	}
}
