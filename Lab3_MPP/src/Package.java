import java.util.*;

public class Package {
	private String description;
	private double weight;
	private Zone zone;
	List<ICarrier> carriers;
	
	public Package(String description, double weight, Zone zone, List<ICarrier> carriers) {
		this.description = description;
		this.weight = weight;
		this.zone = zone;
		this.carriers = carriers;
	}
	
	
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public Zone getZone() {
		return zone;
	}



	public void setZone(Zone zone) {
		this.zone = zone;
	}



	void addCarrier(ICarrier car) {
		carriers.add(car);
	}
	
	void minPrice() {
		double res = 0;
		String name = "";
		for(ICarrier c: carriers) {
			if (res == 0) {
				res = c.calcPrice(this);
				name = c.getName();
			}
			else if (c.calcPrice(this) < res) {
				res = c.calcPrice(this);
				name = c.getName();
			}
		}
		System.out.printf("%s\t%.2f\t the zone is %s", description, res, name);
		return;
	}

}
