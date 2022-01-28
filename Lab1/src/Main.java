
public class Main {

	public static void main(String[] args) {
		Address billingAddress1 = new Address("chicago");
		Address billingAddress2 = new Address("new york");
		Address shippingAddress1 = new Address("fairfield");
		Address shippingAddress2 = new Address("miami");
		
		Customer customer1 = new Customer("yao", "david", "2222222", billingAddress1, shippingAddress1);
		
		Customer customer2 = new Customer("soukeyna", "sylvia", "2222222", billingAddress2, shippingAddress2);
		
		Customer[] array = new Customer[2];
		
		array[0] = customer1;
		array[1] = customer2;
		
		for(int i = 0; i<array.length; i++) {
			if(array[i].getBillingAddress().city.equals("chicago")) {
				System.out.println(array[i]);
			}
		}
	
	}

}
