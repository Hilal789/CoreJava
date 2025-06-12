package Day_3_12_06_25;

import java.util.Arrays;

public class remove_Negative {

	public static void main(String[] args) {

		Integer[] numbers = { -10, -5, 0, 5, 10, 15, -20 };
		
		Arrays.stream(numbers).filter(x-> x>0).forEach(System.out::println);

	}

}
