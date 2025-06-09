package Day_1_09_06_25;


import java.util.stream.Stream;

public class StringConcatenateQ4 {

	public static void main(String[] args) {
		Stream<String> of = Stream.of("Hello", "", "World", " ", "from", " ", "Java", "!");
		String str = of.reduce("",(res,s2)-> res+s2);
		System.out.println(str);
		
	}

}
