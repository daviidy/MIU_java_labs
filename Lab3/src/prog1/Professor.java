package prog1;

public class Professor extends DeptEmployee {
	
	private int numberOfPublications;

	public Professor(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		super(name, yearOfHire, monthOfHire, dayOfHire);
		numberOfPublications = 0;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	

}
