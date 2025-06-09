package Day_1_09_06_25;

import java.util.stream.Stream;

public class PrintNameWithLengthFourQ5 {
public static void main(String[] args) {
	Stream<String> of = Stream.of("Toby", "Anna", "Leroy", "Alex");
	
	of.filter(e-> e.length()==4).forEach(System.out::println);
}
}
