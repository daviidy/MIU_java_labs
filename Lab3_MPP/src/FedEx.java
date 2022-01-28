
public class FedEx extends Carrier {
	private String name;
	
	public FedEx() {
		this.name = "FedEx";
	}

	@Override
	public double calcPrice(Package pack) {
		return pack.getZone().getRate() * pack.getWeight();
	}

	@Override
	public String getName() {
		return name;
	}
	
}
