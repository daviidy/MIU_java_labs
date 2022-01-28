package recursion;

import java.util.Arrays;

public class Exponential {
//	double power(double x,int n) {
//		if (n == 1) {
//			return n;
//		}
//		return x * power(x, n-1);
//	}
	
	//1, 3, 2, 6
	
	static boolean search(int[] arr, int val) throws MyCustomException {
		if (arr == null || arr.length == 0) {
			throw new MyCustomException("Array cannot be null or empty");
		}
		
		if (arr.length == 1) {
			return arr[0] == val;
		}
		int[] newArr = new int[arr.length - 1];
		System.arraycopy(arr, 1, newArr, 0, arr.length - 1);
		
		if (arr[0] == val) {
			return true;
		}
		else {
			System.out.println(Arrays.toString(newArr));
			return search(newArr, val);
		}
		
	}
	
	public static void main(String[] args) {
		Exponential expo = new Exponential();
//		double res = expo.power(2, 10);
//		int[] arr = {1, 3, 2, 6, 7, 9};
		int[] arr = {};
		try {
			System.out.println(search(arr, 10));
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Exiting the application...");
			System.exit(0);
		}
	}
}
