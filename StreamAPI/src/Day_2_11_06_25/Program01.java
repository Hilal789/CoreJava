package Day_2_11_06_25;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program01 {
public static void main(String[] args) {
	   List<String> value=Arrays.asList("apple","orange","      ");
	   
	   Predicate<String> data=
			    s->
	            s.length()>=5
			    &&
			    s!=null
			    &&
			    !s.isBlank()
			    &&
			    s.toLowerCase().matches("^[aeiou].*");
			    
			    
			    
			    value.stream().filter(data)
			    .forEach(System.out::println);
}
}
