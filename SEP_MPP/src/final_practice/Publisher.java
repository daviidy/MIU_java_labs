package final_practice;

public class Publisher {
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		Publisher copy = (Publisher)super.clone();
		return copy;
	}
}
