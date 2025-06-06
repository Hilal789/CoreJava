package Map_06_06_25;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapIterationDemo {
	public static void main(String[] args) {
		Map<String, Integer> std = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number of students to add: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int id = sc.nextInt();
			std.put(name, id);
		}
		System.out.println();
		System.out.println("Using Iterator:");
		Set<Entry<String, Integer>> entrySet = std.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> m = iterator.next();
			System.out.println(m.getKey() + " -> " + m.getValue());
		}

		System.out.println();
		System.out.println("Using Enumeration:");
		Set<String> key = std.keySet();
		Enumeration<String> enumeration = Collections.enumeration(key);
		while (enumeration.hasMoreElements()) {
			String na = enumeration.nextElement();
			Integer v = std.get(na);
			System.out.println(na + " -> " + v);

		}
		System.out.println();
		System.out.println("Using forEach method:");
		std.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}
