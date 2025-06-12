package Day_3_12_06_25;

import java.util.Arrays;

public class LengthOfName3 {

	public static void main(String[] args) {
	    String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};

	    Arrays.stream(words).filter(x->x.length()>3).forEach(System.out::println);
	}

}
