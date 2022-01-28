
public class UPS extends Carrier {
	private String name;

	public UPS() {
		this.name = "UPS";
	}

	@Override
	public double calcPrice(Package pack) {
		return 0.45 * pack.getWeight();
	}

	@Override
	public String getName() {
		return name;
	}
	
	

}
