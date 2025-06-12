package Day_2_11_06_25;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class OddSquaresGenerator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int n = sc.nextInt();
		Stream.iterate(1,x->x+1).filter(x->x%2!=0).limit(n).forEach(y->System.out.println(y*y));
	}

}
