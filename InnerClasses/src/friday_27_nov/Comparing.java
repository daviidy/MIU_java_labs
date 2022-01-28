package friday_27_nov;

import java.util.Arrays;
import java.util.Comparator;

public class Comparing {
	//Member inner class
	class sortByWeight implements Comparator<Pet>{

		@Override
		public int compare(Pet o1, Pet o2) {
			return (int) (o1.getWeight() - o2.getWeight());
		}

	}
	//Static inner class
	static class sortByWeightDescending implements Comparator<Pet>{

		@Override
		public int compare(Pet o1, Pet o2) {
			return (int) (o1.getWeight() - o2.getWeight())*-1;
		}

	}

	public static void main(String[] args) {
		
		//Local inner class
		class sortByAge implements Comparator<Pet>{
			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getAge() - o2.getAge();
			}
			
		}
		
		
		
		Pet p1 = new Pet("first pet", 50, 134);
		Pet p2 = new Pet("second pet", 32, 64);
		Pet p3 = new Pet("third pet", 45, 52);
		Pet p4 = new Pet("fourth pet", 12, 54);
		Pet p5 = new Pet("fifth pet", 23, 44);
		
		Pet[] pets = {p1, p2, p3, p4, p5};
		
		
		Comparing comp = new Comparing();
		Comparing.sortByWeight weight = comp.new sortByWeight();
		Comparing.sortByWeightDescending weightDes = new Comparing.sortByWeightDescending();
		sortByAge ageComp = new sortByAge();
		
		Arrays.sort(pets, new Comparator<Pet>(){

			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getAge() - o2.getAge() *-1;
			}

		});
		
		//Lambda expression
		Arrays.sort(pets, (o1, o2) -> (int) (o1.getWeight() - o2.getWeight())*-1);
		
		
		
		printArray(pets);
	}
	
	
	static void printArray(Pet[] pets) {
		for(Pet p : pets) {
			System.out.println(p);
		}
	}
	
}
