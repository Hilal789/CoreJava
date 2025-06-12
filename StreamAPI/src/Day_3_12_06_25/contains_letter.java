package Day_3_12_06_25;

import java.util.Arrays;

public class contains_letter {

	public static void main(String[] args) {
	    String[] names = {"Rahul", "Raj", "Arnav", "Scott", "Smith","arnav"};

	    Arrays.stream(names).filter(s->s.toUpperCase().startsWith("A")).forEach(System.out::println);
	}

}
