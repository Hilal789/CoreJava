package Enum_CoffeeShop_13_05_25;

import java.util.Scanner;

public class CoffeeShop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1 .cold coffee\n2. Black coffee\n3. milk coffee.");
		int order = Integer.parseInt(sc.nextLine());

		switch (order) {
		case 1:
			System.out.println("Write Size:\n1. Small,\n2. Big \n3. medium.\n==>");
			String size = sc.nextLine();

			CoffeeOrder co = new CoffeeOrder(CoffeeType.coldCoffee, CoffeeSize.valueOf(size));
			System.out.println(co.getOrderDetails());
			break;
		case 2:
			System.out.println("Write Size:\n1. Small,\n2. Big \n3. medium.\n==>");
			size = sc.nextLine();

			CoffeeOrder co2 = new CoffeeOrder(CoffeeType.BlackCoffee, CoffeeSize.valueOf(size));
			System.out.println(co2.getOrderDetails());
			break;
		case 3:
			System.out.println("Write Size:\n1. Small,\n2. Big \n3. medium.\n==>");
			size = sc.nextLine();

			CoffeeOrder co3 = new CoffeeOrder(CoffeeType.milkCoffee, CoffeeSize.valueOf(size));
			System.out.println(co3.getOrderDetails());
			break;

		}

		// CoffeeOrder co = new CoffeeOrder(CoffeeType.BlackCoffee, CoffeeSize.Big);

		// System.out.println(co.getOrderDetails());
	}

}
