package final_practice;

public class Company {
	private String companyName;
	private String companyCity;
	private String companyState;
	private double totalProfitsForThisYear;
	
	public Company(String companyName, String companyCity, String companyState, double totalProfitsForThisYear) {
		super();
		this.companyName = companyName;
		this.companyCity = companyCity;
		this.companyState = companyState;
		this.totalProfitsForThisYear = totalProfitsForThisYear;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyCity() {
		return companyCity;
	}

	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}

	public String getCompanyState() {
		return companyState;
	}

	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}

	public double getTotalProfitsForThisYear() {
		return totalProfitsForThisYear;
	}

	public void setTotalProfitsForThisYear(double totalProfitsForThisYear) {
		this.totalProfitsForThisYear = totalProfitsForThisYear;
	}

	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", companyCity=" + companyCity + ", companyState=" + companyState
				+ ", totalProfitsForThisYear=" + totalProfitsForThisYear + "]";
	}
	
	

}
