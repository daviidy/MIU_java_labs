import java.util.*;

public class Position implements Cloneable {
	private String title;
	private String description;
	private Employee employee;
	private Position superior;
	private List<Position> inferiors;
	
	public Position(String title, String description, Employee employee, List<Position> inferiors, Position superior) {
		this.title = title;
		this.description = description;
		this.employee = employee;
		this.inferiors = inferiors;
		this.superior = superior;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Position getSuperior() {
		return superior;
	}

	public void setSuperior(Position superior) {
		this.superior = superior;
	}

	public List<Position> getInferiors() {
		return inferiors;
	}

	public void setInferiors(List<Position> inferiors) {
		this.inferiors = inferiors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	void print() {
		System.out.printf("\t\tPosition: %s%n", title);
		if (employee == null) {
			System.out.printf("\t\t\tNot filled");
		} else {
			employee.print();
		}
	}
	
	double getSalary() {
		return employee.getSalary();
		
	}
	
	void addInferior(Position inferior) {
		inferiors.add(inferior);
	}
	
	
	void printDownLine() {
		String res = title + ": " + employee.getFirstName();
		
		if (inferiors != null) {
			System.out.printf(res + "%n\t");
			for(Position inf: inferiors) {
				inf.printDownLine();
			}
		}
		else {
			System.out.printf(res);
		}
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Position) || obj == null) {
			return false;
		}
		Position pos = (Position) obj;
		
		return this.getDescription().equals(pos.getDescription())
//				&& this.getEmployee().equals(pos.getEmployee())
				&& this.getTitle().equals(pos.getTitle());
	}
	
	@Override
	public String toString() {
		return "Title: " + title + "\n"
				+ "Description: " + description;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(
				title, 
				description
			);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Position copy = (Position)super.clone();
		return copy;
		
	}
	
	
}
