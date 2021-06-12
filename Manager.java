package employee_data;

public final class Manager extends Employee {
	Manager(){}
	public Manager(String name, int age) {
		super(name,"Manager",age,30000);
	}
	public void raiseSalary() {
		setSal(getSal()+2000);
	}
}
