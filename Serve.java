package employee_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Serve {
	private String name;
	private int age;
	private boolean readData() {
		try {
			System.out.println("enter name...");
			name = br.readLine();
			System.out.println("age...");
			age = Integer.parseInt(br.readLine());
			return true;
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} 
		return false;
	}
	private static Logic getLogic() {
		return new Logic();
	}
	public static Serve getServe() {
		return new Serve();
	}
	Scanner scanner = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void insertLogic() {
		System.out.println("1.Clerk\n2.Manger\n3.Programmer\n4.Exit...");
		int choice = scanner.nextInt();
		Employee emp = null;
		String error = "error while reading data...";
		switch(choice) {
				
		case 1: if(!readData()) {
					System.out.println(error);
					return;
				}
				emp = new Clerk(name, age);
			break;
		case 2: if(!readData()) {
					System.out.println(error);
					return;
				}
				emp = new Manager(name, age);
			break;
		case 3:if(!readData()) {
					System.out.println(error);
					return;
				}
				emp = new Programmer(name, age);
			break;
		case 4:System.out.println("exiting...");
				return;
			default: System.out.println("Invalid entry..."); 
				return;
		}
		getLogic().insertRecord(emp);
		
	}
	public void showAllRecords() {
		List<Employee> emplist = getLogic().getAllRecords();
		for(Employee e: emplist) {
			System.out.println(e);
		}
	}
	public void raiseSalaryLogic() {
		System.out.println("1.Clerk\n2.Manger\n3.Programmer\n4.Exit...");
		int choice = scanner.nextInt();
		Employee emp = null;
		switch(choice) {
				
		case 1: emp = new Clerk();
				emp.setDesig("Clerk");
			break;
		case 2: emp = new Manager();
				emp.setDesig("Manager");
			break;
		case 3:	emp = new Programmer();
				emp.setDesig("Programmer");
				
			break;
		case 4: System.out.println("exiting...");
				return;
			default: System.out.println("Invalid entry..."); 
				return;
		}
		if(emp != null) getLogic().raiseSalary(emp);
	}
	public boolean deleteRecordByIdLogic() {
		System.out.println("enter id to remove record...");
		int empid = scanner.nextInt();
		return getLogic().deleteRecordById(empid);
	}
}
