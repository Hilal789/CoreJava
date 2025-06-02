package TreeSet_02_06_25;

import java.util.Comparator;

public record Product(int pid, String pname) {

//	public Product(int pid,String pname) {
//		this.pname = pname;
//		this.pid=pid;
//	}
	public Product {
		if (pid < 0) {
			throw new IllegalArgumentException("Enter valid ID");
		}
	}


}
