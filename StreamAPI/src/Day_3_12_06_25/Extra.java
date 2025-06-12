package Day_3_12_06_25;

import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Extra {
	/*
	 * Find the sum
	 * Find the avg
	 * Find the count
	 */

	public static void main(String[] args) {
			List<Integer> asList = Arrays.asList(12,34,54,6);
			
			IntSummaryStatistics collect = asList.stream().collect(Collectors.summarizingInt(Integer::intValue));
			System.out.println(collect);
			
			collect.getAverage();
			
	}

}
