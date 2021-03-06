import java.util.*;

public class Department {
	private String name;
	private String location;
	private List<Position> positions;
	
	public Department(String name, String location, List<Position> positions) {
		this.name = name;
		this.location = location;
		this.positions = positions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Position> getPositions() {
		return positions;
	}

	public void setPositions(List<Position> positions) {
		this.positions = positions;
	}
	
	void addPos(Position pos) {
		positions.add(pos);
	}
	
	void print() {
		System.out.printf("\tDepartment: " + name + "%n");
		for(Position pos: positions) {
			pos.print();
		}
	}
	
	void printReportingHierarchy() {
		
	}
	
	Position getDepartmentHead() {
		for(Position pos: positions) {
			if (pos.getSuperior() == null) {
				return pos;
			}
		}
		return null;
	}
	
	double getSalary() {
		int salary = 0;
		for(Position pos: this.positions) {
			salary += pos.getSalary();
		}
		return salary;
		
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Department) || obj == null) {
			return false;
		}
		Department dept = (Department) obj;
		return this.name.equals(dept.name) && this.location.equals(dept.location)
				&& positions.equals(dept.positions);
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n"
				+ "Location: " + location + "\n"
				+ "Positions: " + "\n"
				+ Arrays.toString(this.getPositions().toArray());
	}
	
}
