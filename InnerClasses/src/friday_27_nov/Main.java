package friday_27_nov;

public class Main {
	
	private static String s2 = "my string";
	
	public static void main(String[] args) {
		String s = "Assassins in Rome";
		
		
		class inner{
			String name = "Local Inner";
			void myVoid() {
				String x = s2;
				String y = s;
			}
		
		}
		
		inner i = new inner();
		
		
		
		//System.out.println(s.substring(0, 6));
		//System.out.println(s.charAt(9));
		//System.out.println(s.substring(13));
		//System.out.println(s.length());
		
		//System.out.println(6 + (2*5));
		//System.out.println((int) 16.24);
		
		int i2 = 7;
		float f = i2;
		//System.out.println(f);
		
		int x = 14;
		//System.out.println(--x + x++);
		
		//System.out.println("x" == "x");
		//System.out.println("x".equals("x"));
		//System.out.println("x".equals("x") && "x" == "x");
		//System.out.println("x".equals("x")|| "x" == "x");
		
		String[] arr = {"Everything", "you", "can", "imagine", "is", "real"};
		
		//System.out.println(smallestString(arr));
		
		
		Pet p = new Pet();
		System.out.println(p);
		p.setName("Batcat");
		p.setAge(p.getAge()+3);
		System.out.println(p);
		Pet p2 = new Pet("Sterlicat", 74, 100);
		System.out.println(p2);
	}

	static int smallestString(String[] arr) {
		if(arr == null || arr.length == 0) return -1;
		
		int result = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[result].length() > arr[i].length()) result = i;
		}
	
		return result;
	}
}
