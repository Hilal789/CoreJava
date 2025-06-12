package Day_3_12_06_25;

import java.util.Arrays;

public class Prime_Numbers {

	public static boolean isPrime(int num) {
		int count=0;
		boolean result=false;
		if(num<2) {
		    return result;
		}
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		 if(count==2)
		  result=true;
		 
		 return result;
		
	}

	public static void main(String[] args) {
		int[] numbers = { 1,2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
			
		int [] primeArr=
		Arrays.stream(numbers).filter(Prime_Numbers::isPrime).toArray();
		System.out.println(Arrays.toString(primeArr));
		
		
	}

}
