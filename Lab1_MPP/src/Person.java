
abstract class Person implements IPerson {
	protected String name;
	protected String phone;
	protected int age;
	
	
	public Person(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	double getTotalSalary() {
		double res = 0;
			
//		if(this instanceof Faculty) {
//			res += ((Faculty) this).getSalary();
//		}
//		
//		if(this instanceof Staff) {
//			res += ((Staff	) this).getSalary();
//		}
//		res += ((Faculty) this).getSalary();
		
		
					
		res += this.getSalary();
		return res;
	}
	
	abstract double getSalary();

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}
	
	abstract void addCourse(Course c);
	
}
