package practice1;

public class Secretary extends Employee {
	private String contractType;

	public Secretary() {
		super("estelle", 1234, 1000);
		contractType = "full-time";
	}
	
	

	public Secretary(String name, int idNumber, double salary, String contractType) {
		super(name, idNumber, salary);
		this.contractType = contractType;
	}



	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}



	@Override
	public String toString() {
		return super.toString() +  "Secretary [contractType=" + contractType + "]";
	}




	@Override
	public int compareTo(Employee o) {
		return (int) (super.getSalary() - o.getSalary()) * -1;
	}
	
	
	
	
	
}
