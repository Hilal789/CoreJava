package Enum_CoffeeShop_13_05_25;

public class CoffeeOrder {

	private CoffeeType type;
	private CoffeeSize size;

	public CoffeeOrder(CoffeeType type, CoffeeSize size) {
		super();
		this.type = type;
		this.size = size;
	}

	public String getOrderDetails() {
		

		return "Coffee Type: "+type.name()+"Coffee Size: "+size.name();
	}

}
