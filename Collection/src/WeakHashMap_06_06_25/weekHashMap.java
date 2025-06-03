package WeakHashMap_06_06_25;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/*
 *Program 01 :
------------
Write a program to show that WeakHashMap keys are weak in comparison to HashMap, if key is a reference key and it's value is set to be null.

 */

class A{
	int num=10;

	public A(int num) {
		super();
		this.num = num;
	}

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
}
public class weekHashMap {

	public static void main(String[] args) throws InterruptedException {
		Map< A,String> wm= new WeakHashMap<>();
		
		A a = new A(5);
		A a1 = new A(10);
		wm.put(a,"First");
		wm.put(a1,"Second");
		System.out.println("Before garbage Collector :"+wm);
		
		a=null;
		System.gc();
		
		Thread.sleep(500);
		
		System.out.println("After Garbage Collecrtion"+wm);
		Map< A,String> hm= new HashMap<>();
		hm.put(a1,"hmfirst");
		hm.put(a,"hmsecond");
//		System.out.println("before gc :"+hm);
//		a1=null;
//		System.gc();
//		Thread.sleep(500);
//		
//		System.out.println("after gc :"+hm);
		
		
	
	}

}
