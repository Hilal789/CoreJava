package Day_2_11_06_25;

import java.util.Arrays;
import java.util.List;

public class StringSortExample {

	public static void main(String[] args) {
		 List<String> l = Arrays.asList("banana","apple","fig","cherry","bluebreey","date","kiwi","apricot");

		    l.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);
	}

}
