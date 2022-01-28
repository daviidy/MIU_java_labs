import java.util.Arrays;
import java.util.Comparator;

public class VehicleTest {
	
	public VehicleTest() {
		nonstatic();
	}
	
	
	public static void main(String[] args) {
		VehicleTest veh = new VehicleTest();
	}
	
	void nonstatic() {
		
		class sortByNameDecending2 implements Comparator<Vehicle>{
			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				return o1.getModel().compareTo(o2.getModel()) * -1;
			}
		}
		
		Bike b5 = new Bike(0, "Expo", 16.7, "Aircycle");
		Bike b6 = new Bike(0, "Mountain", 16.7, "Aircycle");
		
		Bike b = new Bike(0, "Toddy", 16.7, "Aircycle");
		Bike b2 = new Bike();
		
		Motorcycle m = new Motorcycle();
		Motorcycle m2 = new Motorcycle(2, "YAMAHA", 64.7, 2.4f);
		
		Car c = new Car();
		Car c2 = new Car(6, "Dodge", 146.8, "Truck");
		
		Vehicle[] vArr = {b, b2, m, m2, c, c2};
		
		Arrays.sort(vArr, (o1, o2) -> o1.getModel().compareTo(o2.getModel()) * -1);
		
		for(Vehicle v : vArr) {
			System.out.println("Vehicle info: " + v.toString() + " Average Speed " + v.calculateAverageSpeed());
		}
		
		System.out.println(b5.equals(b6) + " : " + b5.compareTo(b6));
	}
	

}
