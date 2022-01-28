package Exceptions;

public class ExcceptionTester {
	
	private static int i = 15;
	
	public static void main(String[] args) {
		
		
		
		try {
			temp();
		} catch (DifferentException e) {
			System.out.println(e.getMessage() +  ", We triggered another exception!");
		}
		
	}
	
	
	static void temp() throws DifferentException {
		try {
			System.out.println(getI());
		}catch(Layer2Exception ee) {
			System.out.println("this is a layer 2 exception");
		}catch (Layer1Exception e) {
			throw new DifferentException("This is a different exception");
		}catch(AnotherLayer1Exception e2) {
			System.out.println(e2.getMessage());
		}finally {
			System.out.println("In finally");
		}
		
	}
	
	static int getI() throws Layer1Exception, AnotherLayer1Exception {
		if(i < 15) throw new Layer2Exception("It's less than 15");
		if(i == 15) throw new Layer1Exception("It's 15");
		if(i > 15) throw new AnotherLayer1Exception("Now it's more than 15");
		return i;
	}
}
