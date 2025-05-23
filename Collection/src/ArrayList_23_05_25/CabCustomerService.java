package ArrayList_23_05_25;

import java.util.ArrayList;

public class CabCustomerService {

	private ArrayList<CabCustomer> list = new ArrayList<CabCustomer>();

	public void addCabCustomer(CabCustomer customer) {
		if (isFirstCustomer(customer.getPhone()))
		{
			list.add(customer);
			System.out.println(customer.getCustomerName()+" added Succussfully");
		}
		else
			System.err.println(customer.getCustomerName()+" already existed CUstomer");
	}

	public boolean isFirstCustomer(String phone) {

		for (CabCustomer customer : list) {
			if (customer.getPhone().equals(phone)) {
				return false;
			}
		}
		return true;
	}
	
	public double calculateBill(CabCustomer cust) {
		if(isFirstCustomer(cust.getPhone())) {
			return 0;
		}
		else if(cust.getDistance()<=4) {
			return 80;
			
		}
		if(cust.getDistance()> 4 ) {
			return (6 * cust.getDistance()) + 80;
		}
		else {
			System.out.println("");
			return 0;
		}
		
	}
	
	public void printBill(CabCustomer cust) {
		System.out.println("++++++++++Bill Details ++++++++");
		System.out.println(cust.getCustomerName()+" Please pay your bill of Rs."+calculateBill(cust));
		
	}

}
