package Day_3_12_06_25;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Extract_First_Letter {

	public static void main(String[] args) {
	      String []names = {"James", "Aryan", "Vibha", "Aniket"};
	      List<String> collect = Arrays.stream(names).map(x->x.charAt(0)+"").collect(Collectors.toList());
	      System.out.println(collect);
	}

}
