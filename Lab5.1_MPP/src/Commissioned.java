import java.util.ArrayList;
import java.util.*;

public class Commissioned extends Employee {
	
	private int commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(int empId, int baseSalary) {
		super(empId);
		this.commission = 7;
		this.baseSalary = baseSalary;
		this.orders = new ArrayList();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	double calcGrossPay(DateRange date) {
		double res = baseSalary;
		for(Order ord: orders) {
			if(date.isInRange(ord.getOrderDate())) {
				System.out.println(true);
				double gain = ord.getOrderAmount() * 0.07;
				res += gain;
			}
		}
		return res;
	}

	public int getCommission() {
		return commission;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	
	void addOrder(Order ord) {
		orders.add(ord);
	}
	
}
