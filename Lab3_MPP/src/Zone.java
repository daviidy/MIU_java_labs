
public class Zone {
	private String name;
	private double rate;
	
	public Zone(String name) {
		this.name = name;
		this.rate = calcRate();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	double calcRate() {
		switch (name){
			case "IA":
			case "OR":
			case "CA":
			case "MT": {
				
				return 0.35;
			}
			case "TX":
			case "UT": {
				return 0.3;
			}
			case "FL":
			case "MA":
			case "OH": {
				return 0.55;
			}
			default:
				return 0.43;
		}
	}
	
}
