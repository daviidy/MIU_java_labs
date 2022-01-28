package prog1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor professor1 = new Professor("dave", 2021, 01, 13);
		Professor professor2 = new Professor("armel", 2021, 06, 14);
		Professor professor3 = new Professor("nda", 2021, 11, 13);
		
		Secretary secretary1 = new Secretary("yao", 2021, 01, 13);
		Secretary secretary2 = new Secretary("carmel", 2021, 01, 13);
		
		professor1.setNumberOfPublications(10);
		professor2.setNumberOfPublications(10);
		professor3.setNumberOfPublications(10);
		
		secretary1.setOvertimeHours(200);
		secretary2.setOvertimeHours(200);
		
		DeptEmployee[] department = new DeptEmployee[5];
		
		department[0] = professor1;
		department[1] = professor2;
		department[2] = professor3;
		department[3] = secretary1;
		department[4] = secretary2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See sum of all salaries?");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			double sumSalary = 0;
			for (int i = 0; i < department.length; i++) {
				sumSalary += department[i].computeSalary();
			}
			System.out.println(sumSalary);
		}
	}

}
