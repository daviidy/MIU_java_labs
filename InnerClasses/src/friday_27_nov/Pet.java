package friday_27_nov;

public class Pet implements Comparable<Pet>{
	private String name;
	private int age;
	private float weight;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getWeight() {
		return weight;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
	public Pet() {
		this.name = "Mr Sparkles";
		this.age = 5;
		this.weight = 45;
	}
	public Pet(String name, int age, float weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	
	
	@Override
	public int compareTo(Pet o) {
		return name.compareTo(o.getName()) *-1;
	}
	
	
	
}
