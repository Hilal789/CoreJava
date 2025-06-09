package Day_1_09_06_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareOfPositiveNumberQ3 {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(-3, 2, -5, 6, -1, 4);

		Integer sum = l.stream().filter(num -> num > 0) // Filter positive numbers
				.map(n -> n * n) // Square each positive number
				.reduce(0, (x,y)-> x+y); // Sum all squared values

		System.out.println("Sum of squared positive numbers: " + sum);

		List<Integer> nums = Arrays.asList(-300, 201, -5, 603, -101, 601, 6, 786);

		nums.stream().filter(num -> num > 0) // Filter positive numbers
				.map(n -> n+"") // Square each positive number
				.filter(s -> s.startsWith("6")).forEach(System.out::println);


	}

}
