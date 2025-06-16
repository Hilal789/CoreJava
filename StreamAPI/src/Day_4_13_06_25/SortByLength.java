package Day_4_13_06_25;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortByLength {

	public static void main(String[] args) {

		Stream.iterate(1, n -> n + 1).filter(c -> c % 2 != 0).map(v -> v * v).limit(10).forEach(System.out::println);

		List<String> list = Arrays.asList("Hilal", "Bhagu", "Bhag", "Bha", "Ba", "Htyhg", "Bhagu", "Bhag", "Bha", "Ba",
				"f");
		list.stream().sorted(Comparator.comparingInt(String::length).thenComparing((t1, t2) -> t1.compareTo(t2)))
				.distinct().forEach(System.out::println);

		System.out.println("=======================================================");
		list.stream().sorted((t1, t2) -> {
			if (t1.length() != t2.length()) {
				return Integer.compare(t1.length(), t2.length());
			} else {
				return t1.compareTo(t2);
			}
		}).distinct().forEach(System.out::println);

	}
}
