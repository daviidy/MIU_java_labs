
public class InnerClassDemo {
	public String myName;
	
	public static class StaticInnerClassDemo{
		public String staticName;
		public static void myInnerMethod() {
			System.out.println("This is the Static Inner Class");
		}
	}
	
	 class MyInnerClass{
		private String name;
		public MyInnerClass(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		class secondInnerClass{
			
			private int accountNumber;
			public secondInnerClass(int accountNumber) {
				this.accountNumber = accountNumber;
			}
			
			public int getAccountNumber() {
				return this.accountNumber;
			}
			
		}
	}
	
	public void myOuterMethod(int age) {
		class MyLocalClass{
			private int age;
			
			public MyLocalClass(int age) {
				this.age = age;
			}
			
			public int getAge() {
				return age;
			}
		}
		
		MyLocalClass local = new MyLocalClass(age);
		System.out.println("This is the age of the local class" + local.getAge());
	}

}
