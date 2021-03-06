
public class Paycheck {
	private double grossPay;
	private double fica;
	private double state;
	private double local;
	private double medicare;
	private double socialSecurity;
	private DateRange payPeriod;
	private Employee emp;
	
	public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity,
			DateRange payPeriod, Employee emp) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state = state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
		this.payPeriod = payPeriod;
		this.emp = emp;
	}
	
	void print() {
		System.out.printf("Paycheck for the date range: %s\n", payPeriod.toString());
		System.out.printf("Gross Pay\t%.2f\n", grossPay);
		System.out.printf("FICA\t%.2f\n", fica);
		System.out.printf("State\t%.2f\n", state);
		System.out.printf("Local\t%.2f\n", local);
		System.out.printf("Medicare\t%.2f\n", medicare);
		System.out.printf("Social Security\t%.2f\n", socialSecurity);
		System.out.printf("Total\t%.2f\n", getNetPay());
	}
	
	double getNetPay() {
		return grossPay - state - local - medicare - socialSecurity;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public double getFica() {
		return fica;
	}

	public double getState() {
		return state;
	}

	public double getLocal() {
		return local;
	}

	public double getMedicare() {
		return medicare;
	}

	public double getSocialSecurity() {
		return socialSecurity;
	}

	public DateRange getPayPeriod() {
		return payPeriod;
	}

	public Employee getEmp() {
		return emp;
	}
	
	
}
