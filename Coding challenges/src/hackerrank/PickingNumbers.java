package hackerrank;

import java.util.*;

public class PickingNumbers {
	
	public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        List<Integer> subArr = new ArrayList<Integer>();
        int maxLength = 0;
        for(int i = 0; i<a.size(); i++){
            subArr.add(a.get(i));
            for(int j = 0; j<a.size(); j++){
            	if (isValid(a.get(j), subArr) && j != i) {
					subArr.add(a.get(j));
				}
            }
            if (subArr.size() > maxLength) {
				maxLength = subArr.size();
			}
            subArr = new ArrayList<Integer>();
        }
        return maxLength;
    }
	
	public static boolean isValid(int val, List<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			if (Math.abs(val - arr.get(i)) > 1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		System.out.println(pickingNumbers(list));
	}
}
