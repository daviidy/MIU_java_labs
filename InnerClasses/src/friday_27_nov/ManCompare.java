package friday_27_nov;

import java.util.Arrays;
import java.util.Comparator;

public class ManCompare {
	
	class sortByName implements Comparator<Man>{

		@Override
		public int compare(Man o1, Man o2) {
			return (int)(o1.getName().length() - o2.getName().length());
		}
		
	}
	
	public static void main(String[] args) {
		class sortByAge implements Comparator<Man>{

			@Override
			public int compare(Man o1, Man o2) {
				return (int)(o1.getAge() - o2.getAge());
			}
			
		}
		
		Man dave = new Man("dave", 27, 10000);
		Man y = new Man("y", 23, 12000);
		Man z = new Man("z", 24, 5000);
		
		Man[] men = new Man[3];
		men[0] = dave;
		men[1] = y;
		men[2] = z;
		
		ManCompare compare = new ManCompare();
		
		ManCompare.sortByName compareName = compare.new sortByName();
		
		Arrays.sort(men, compareName);
		
		System.out.println(Arrays.toString(men));
	}

}
