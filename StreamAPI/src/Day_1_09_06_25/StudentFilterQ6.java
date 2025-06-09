package Day_1_09_06_25;

import java.util.List;


record Student(String name, String course) {

}

public class StudentFilterQ6 {

	public static void main(String[] args) {
		List<Student> l = List.of(new Student("Hilal", "JAVA"), new Student("Sonu", ".NET"),
				new Student("Alice", "Java"), new Student("Charlie", "Java"), new Student("David", "C++"));
		
		
		l.stream().map(s->s.name()).forEach(System.out::println);
	}

}
