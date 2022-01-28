package prog5_2;

public class Top {
	int t = 1;
	Middle mid;
	Middle.Bottom midbot;
	//returns the value in the instance able of Bottom
	int readBottom() {
		//implement
		mid = new Middle();
		midbot = mid.new Bottom();
		return midbot.b;
	}
	class Middle {
		int m = 2;
		//returns sum of instance able in Top and
		//instance able in Bottom
		int addTopAndBottom() {
			//implement
			Top top = new Top();
			Bottom bottom = new Bottom();
			return top.t + bottom.b;
		}
		class Bottom {
			int b = 3;
			//returns the product of the instance able
			//in all three classes
			int multiplyAllThree() {
				//implement
				Top top = new Top();
				Middle middle = new Middle();
				return top.t * middle.m * b;
			}
		}
	}
	public static void main(String[] args){
		Top top = new Top();
		System.out.println(top.readBottom());
		System.out.println(top.mid.addTopAndBottom());
		System.out.println(top.midbot.multiplyAllThree());
	}
}
