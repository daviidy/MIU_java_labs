package prog_5;

public class MyTable {
	private Entry[] entries = new Entry[26];
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		for(Entry e: entries) {
			if (e.ch == c) {
				return e.str;
			}
		}
		return null;
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		Entry entry = new Entry(s, c);
		for(int i = 0; i<entries.length; i++) {
			if (entries[i] == null) {
				entries[i] = entry;
				return;
			}
			else if (entries[i].ch == entry.ch) {
				return;
			}
		}
	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String output = "";
		for(int i = 0; i<entries.length; i++) {
			if (entries[i] != null) {
				output += entries[i].toString() + "\n";
			}
		}
		return output;
	}
	
	
	private class Entry {
		private String str;
		private char ch;
		Entry(String str, char ch){
			this.str = str;
			this.ch = ch;
		}
		//returns a String of the form "ch->str" 
		public String toString() {
			return ch + "->" + str;
		}
	}

}