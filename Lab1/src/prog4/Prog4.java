package prog4;

public class Prog4 {
	public static void main(String[] args) {
		String[] records = Data.records.split(":");
		for(int i = 0; i<records.length; i++) {
			System.out.println(records[i].split(",")[0]);
		}
		
	}
}
