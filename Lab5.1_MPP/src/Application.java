import java.time.*;

public class Application {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2022, 2, 2);
		LocalDate date2 = LocalDate.of(2022, 2, 2);
		
		Employee emp1 = new Hourly(1, 25, 40);
		Employee emp2 = new Commissioned(2, 2000);
		Order ord1 = new Order(1, date1, 5000, (Commissioned) emp2);
		((Commissioned) emp2).addOrder(ord1);
		emp1.calcCompensation(2, 2022);
		emp2.calcCompensation(2, 2022);
		emp2.print();
	}

}
