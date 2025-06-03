package com.lab.explanation;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;


class Person{
	int age;
	String name;
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
public class Test {
	
	public static void main(String[] args) {
		Map<Person,String> hm= new HashMap<>();
		Person p1= new Person(22,"Virat");
		Person p2= new Person(22,"Virat");
		
//		hm.put(p1, "First");
//		hm.put(p2, "Second");
//		System.out.println(hm);
		
		IdentityHashMap<Person, String> im= new IdentityHashMap<>();
		im.put(p1, "im Fisrt");
		im.put(p2, "im Second");
		System.out.println(im);
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
	}

}
