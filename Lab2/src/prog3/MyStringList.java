package prog3;

public class MyStringList {
	
	private String[] strArray;
	private int size;
	
	public MyStringList() {
		strArray = new String[2];
		size = 0;
	}


	public void add(String s) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == null) {
				strArray[i] = s;
				size += 1;
				return;
			}
		}
		resize();
		add(s);
		
	}
	
	public String get(int i) {
		return strArray[i];
	}
	
	public boolean find(String s) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(String s) {
		
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null && strArray[i].equals(s)) {
				System.arraycopy(strArray, i + 1, strArray, i, strArray.length - i - 1);
				size -= 1;
				return true;
			}
		}

		return false;
	}
	
	public String toString() {
		String output = "[ ";
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null) {
				output += strArray[i] + ", ";
			}
		}
		output += "]";
		
		return output;
	}
	
	public int size() {
		return size;
	}
	
	private void resize() {
		System.out.println("Resizing...");
		String[] newArray = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, newArray, 0, strArray.length);
		strArray = newArray;
		
	}
	
	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);


	}

}