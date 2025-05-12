package Enum_Overriding_12_05_25;

public class EnumChecker {
	public static void main(String[] args) {

		Employee emp = new Employee();
		Clerk cl = new Clerk();

		Manager m = new Manager("Ravi", 121, 2000, ManagerType.HR);
		m.setSalary(m.getSalary());

		
	   Clerk c2 = new Clerk("aaa", 123, 4000, 90, 97);
	   c2.setSalary(c2.getSalary());
	   c2.setAccuracy(100);
	   
	   c2.setSalary(c2.getSalary());

	}
}
