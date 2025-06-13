package Day_3_12_06_25;

import java.util.Arrays;

public class Palindrome {

	public static boolean isPalindrome(String str) {
	
		StringBuffer rev = new StringBuffer(str);
		System.out.println(rev);
		return str.equalsIgnoreCase(rev.reverse().toString());

	}

	public static void main(String[] args) {
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
			
		Arrays.stream(words).filter(Palindrome::isPalindrome).forEach(System.out::println);
		
		
		
//		
//		StringBuffer st=new StringBuffer("PNB");
//		
//		st.append((int)(Math.random()*1000000));
//		System.out.println(st);
//		
//		String st=new String("Ravi");
//		st=st.concat("Shankar");
//		
//		System.out.println(st);
	}

}
