package Enum_Overriding_12_05_25;

public class Manager extends Employee {

	private ManagerType mType;

	public Manager() {
		super();
	}

	public Manager(String name, int employeeId, double salary, ManagerType mType) {
		super(name, employeeId, salary);
		this.mType = mType;
	}

	@Override
	public void setSalary(double salary) {

		if (ManagerType.HR.equals(mType)) {
			System.out.println("Manger Type is :" + mType + "\nBasic Salary : " + getSalary());

			super.setSalary(getSalary() + 10000 + salary);
			System.out.println("Updated Salary for " + mType + " Manager :" + getSalary());

		} else {
			System.out.println("Manger Type is :" + mType + "\nBasic Salary : " + getSalary());
			super.setSalary(getSalary() + 5000 + salary);

			System.out.println("Updated Salary for " + mType + " Manager :" + getSalary());

		}
	}

	public ManagerType getmType() {
		return mType;
	}

	public void setmType(ManagerType mType) {
		this.mType = mType;
	}

}
