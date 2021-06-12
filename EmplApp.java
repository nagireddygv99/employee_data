package employee_data;

import java.util.Scanner;

public class EmplApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1.insert record\n2.display records\n3.raise salary\n4.delete record by id\n5.exit...");
			choice = scanner.nextInt();
			switch(choice) {
			case 1: Serve.getServe().insertLogic();
				break;
			case 2: Serve.getServe().showAllRecords();
				break;
			case 3:	Serve.getServe().raiseSalaryLogic();
				break;
			case 4: if(Serve.getServe().deleteRecordByIdLogic()) System.out.println("record removed successfully...");
					else System.out.println("record remove unsuccessful..."); 
			
					break;
			case 5: System.out.println("exiting...");
			        break;
				default: System.out.println("invalid choice..."); 
						break;
			}
		} while(choice != 5);
		scanner.close();
	}
}
