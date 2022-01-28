package prog5_3;

import java.util.*;

public class StringSort {
	
	private Comparator<String> result;
	
	StringSort(Comparator<String> myComparator){
		result = myComparator;
	}
	
	public String[] stringSort(String[] arr) {
		Arrays.sort(arr, result);
		return arr;
	}
}
