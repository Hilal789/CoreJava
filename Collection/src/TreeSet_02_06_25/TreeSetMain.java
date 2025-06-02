package TreeSet_02_06_25;

import java.util.TreeSet;

public class TreeSetMain {
	public static void main(String[] args) {
		TreeSet<Product> pro = new TreeSet<Product>((p1, p2) -> p1.pid() - p2.pid());
		TreeSet<Product> pro2 = new TreeSet<Product>((p1, p2) -> p2.pid() - p1.pid());
		TreeSet<Product> pro1 = new TreeSet<Product>((p1, p2) -> p1.pname().compareToIgnoreCase(p2.pname()));
		TreeSet<Product> pro3 = new TreeSet<Product>((p1, p2) -> p2.pname().compareToIgnoreCase(p1.pname()));

		pro.add(new Product(3, "Laptop"));
		pro.add(new Product(1, "Mobile"));
		pro.add(new Product(9, "Desktop"));
		pro.add(new Product(6, "Keyboard"));

		pro1.addAll(pro);
		pro2.addAll(pro);
		pro3.addAll(pro);
		
		System.out.println("1) Sort based on the pid in ascending order.\r\n" + "");
		pro.forEach(System.out::println);
		System.out.println("2) Sort based on the pid in descending order.\r\n" + "");
		pro2.forEach(System.out::println);
		System.out.println("3) Sort based on the name in Alphabetical order.\r\n" + "");
		pro1.forEach(System.out::println);
		System.out.println("4) Sort based on the name in Reverse order.\r\n"
				+ "");
		pro3.forEach(System.out::println);
	}
}
