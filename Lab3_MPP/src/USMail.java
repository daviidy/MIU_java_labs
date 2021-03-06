
public class USMail extends Carrier {
	private String name;

	public USMail() {
		this.name = "USMail";
	}

	@Override
	public double calcPrice(Package pack) {
		double cost = 0;
		if (pack.getWeight() < 3) {
			cost = 1;
		} else {
			cost = 0.55 * pack.getWeight();
		}
		return cost;
	}

	@Override
	public String getName() {
		return name;
	}

}
