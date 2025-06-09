package Day_1_09_06_25;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumberQ1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		l.stream().filter(num-> num%2 == 0).forEach(System.out::println);
	}

}
