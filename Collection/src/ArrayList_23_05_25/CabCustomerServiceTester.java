package ArrayList_23_05_25;

import java.beans.Customizer;
import java.util.ArrayList;
import java.util.Scanner;

public class CabCustomerServiceTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CabCustomer c1 = new CabCustomer(121, "Lokesh", "HYD", "Delhi", 1, "92349234");
		CabCustomer c2 = new CabCustomer(121, "Lokesh", "HYD", "Delhi", 12, "92349234");
		CabCustomer c3 = new CabCustomer(234, "Amresh", "HYD", "Delhi", 6, "9234329234");
		CabCustomer c4 = new CabCustomer(341, "Rohit", "HYD", "Delhi", 12, "324535");

		ArrayList<CabCustomer> clist = new ArrayList<CabCustomer>();
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		clist.add(c4);
		System.out.println("==========Customer List Application============");
		clist.forEach((cust) -> {
			System.out.println(cust);
		});
		System.out.println("\nCustomer Cab Services");
		System.out.println("Enter How many Customer You want to add for Cab Service");
		int custNo = sc.nextInt();

		System.out.println("Provide Customer ID for Adding to the Cab Service \n");
		CabCustomerService cab = new CabCustomerService();
		for (int i = 0; i < custNo; i++) {
			System.out.println((i + 1) + " :Enter ID :");
			int custId = sc.nextInt();

			for (CabCustomer cid : clist) {
				if (cid.getCustId() == custId) {
					cab.addCabCustomer(cid);
				}

			}

		}
		System.out.println("======================================================");
		System.out.println("Enter id to print Details");
		int id = sc.nextInt();

		for (CabCustomer cid : clist) {
			if (cid.getCustId() == id) {
				cab.printBill(cid);
			}

		}

	}
}
