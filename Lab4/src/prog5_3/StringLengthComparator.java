package prog5_3;

import java.util.*;

public class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length() - o2.length();
	}

//	@Override
//	public String compare(String s1, String s2) {
//		if (s1.length() < s2.length()) {
//			return "s1 is less than s2";
//		}
//		else if (s1.length() > s2.length()) {
//			return "s2 is less than s1";
//		}
//		return "s1 is equal to S2";
//	}
	
	

}
