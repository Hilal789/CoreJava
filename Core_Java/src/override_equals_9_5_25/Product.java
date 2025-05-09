package override_equals_9_5_25;

class Employee {

	private int eId;
	private String eName;

	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
}

public class Product {

	private int productId;
	private String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	@Override
	public boolean equals(Object obj) {
		boolean b = false;
		if (obj instanceof Product) {
			Product p = (Product) obj;
			if (p.productId == this.productId && p.productName == this.productName) {
				b = true;
			}
		} else {
			System.out.println("This is not a product instace");
		}
		return b;

	}

}
