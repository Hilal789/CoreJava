package Day_2_11_06_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWordsExtractor {

	private static Stream<Stream<String>> map;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[3];
		List<String> l = new ArrayList<String>();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
			l.add(arr[i]);

		}
		
		System.out.println(l);
		
		l.stream().flatMap(x->Arrays.stream(x.toLowerCase().split("[\\s\\p{Punct}]"))).distinct().forEach(x->System.out.println(x));
//		List<String> collect = map2.flatMap(x->x.map(y->y.toLowerCase())).collect(Collectors.toList());
//		collect.stream().filter(x->Collections.frequency(collect,x)>=1).distinct().forEach(x->System.out.println(x));
	}

}
