package prog3;

public class AccountList {
	
	private Account[] strArray;
	private int size;
	
	public AccountList() {
		strArray = new Account[2];
		size = 0;
	}


	public void add(Account acct) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == null) {
				strArray[i] = acct;
				size += 1;
				return;
			}
		}
		resize();
		add(acct);
		
	}
	
	public Account get(int i) {
		return strArray[i];
	}
	
	public boolean find(Account s) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean remove(Account s) {
		
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
		Account[] newArray = new Account[strArray.length * 2];
		System.arraycopy(strArray, 0, newArray, 0, strArray.length);
		strArray = newArray;
		
	}
	
//	public static void main(String[] args) {
//		AccountList l = new AccountList();
//		l.add("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Steve");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Susan");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.add("Dave");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Mark");
//		System.out.println("The list of size " + l.size() + " is " + l);
//		l.remove("Bob");
//		System.out.println("The list of size " + l.size() + " is " + l);
//
//
//	}

}