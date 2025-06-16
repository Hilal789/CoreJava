package Day_3_12_06_25;

import java.util.Arrays;
import java.util.stream.Collectors;

public class convert_boolean {

	public static void main(String[] args) {
	    Boolean[] bhagu = {true, false, true, false, true};
	    
	    
	 Arrays.stream(bhagu).map(flag -> flag ? "Yes" : "No").forEach(System.out::println);
	   


	}

}
