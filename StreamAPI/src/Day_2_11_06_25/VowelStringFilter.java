package Day_2_11_06_25;

import java.util.Arrays;
import java.util.List;

public class VowelStringFilter {

	public static void main(String[] args) {
		
		
		List<String> l = Arrays.asList("apple","orange","umbrella","elephant","icecream","banana","grape","strawberry","octopus","kiwi");
		
		
		
		//l.stream().filter(n-> n.startsWith("a")||n.startsWith("e") ||n.startsWith("i")||n.startsWith("o")||n.startsWith("u")).filter(a->a.length()>5).forEach(System.out::println);
        l.stream().filter(str->"aeiouAEIOU".contains(str.charAt(0)+"")).forEach(System.out::println);
	}

}
