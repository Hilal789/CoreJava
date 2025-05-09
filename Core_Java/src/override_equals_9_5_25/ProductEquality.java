package override_equals_9_5_25;

public class ProductEquality {

	public static void main(String[] args) {

		Product p1 = new Product(23, "Hati");
		Product p2 = new Product(23, "Hati");
		Employee e = new Employee(23, "Hati");
		System.out.println(p1.equals(p2));

	}

}
