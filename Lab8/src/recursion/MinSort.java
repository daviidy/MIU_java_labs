package recursion;

public class MinSort {
	
	public String sort(String s) {
		if (s.length() == 1) {
			return s;
		}
		int minpos = minpos(0, s);
		String str = swap(minpos, s);
		String first = str.substring(0, 1);
		String rest = str.substring(1);
		
		//System.out.println(first);
		//System.out.println(rest);
		return first + sort(rest);
	}
	
	public int minpos(int bottom, String s) {
		char min = s.charAt(bottom);
		int index = bottom;
		for (int i = bottom+1; i < s.length(); i++) {
			if (s.charAt(i) < min) {
				min = s.charAt(i);
				index = i;
			}
		}
		return index;
	}
	
	public String swap(int i, String s) {
		String res = "";
		String[] arr = s.split("");
		String temp = arr[i];
		arr[i] = arr[0];
		arr[0] = temp;
		for (int j = 0; j < arr.length; j++) {
			res += arr[j];
		}
		return res;
	}
	
	public static void main(String[] args) {
		MinSort ms = new MinSort();
		String result = ms.sort("zwxuabfkafutbbbb");
		System.out.println(result);
	}
	
	
}
