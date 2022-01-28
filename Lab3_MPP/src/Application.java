import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		ICarrier ups = new UPS();
		ICarrier usmail = new USMail();
		ICarrier fedex = new FedEx();
		
		List<Package> packages = new ArrayList();
		
		Scanner myObj = new Scanner(System.in);
	    System.out.println("Enter number of packages you want to send");

	    String number = myObj.nextLine();
	    
	    for (int i = 0; i < Integer.parseInt(number); i++) {
	    	int num = i + 1;
	    	System.out.println("Enter description of the package number " + num);

		    String description = myObj.nextLine();
		    
		    System.out.println("Enter weight of the package number " + num);

		    double weight = Double.parseDouble(myObj.nextLine());
		    
		    System.out.println("Enter zone of the package number " + num);

		    String  zone = myObj.nextLine();
		    
		    Zone zoneObj = new Zone(zone);
		    
		    Package pack = new Package(description, weight, zoneObj, new ArrayList());
		    
		    pack.addCarrier(ups);
		    pack.addCarrier(usmail);
		    pack.addCarrier(fedex);
		    
		    packages.add(pack);
		}
	    
	    for(Package pack: packages) {
	    	pack.minPrice();
	    }

	}

}
