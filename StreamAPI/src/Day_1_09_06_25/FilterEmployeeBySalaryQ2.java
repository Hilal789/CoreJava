package Day_1_09_06_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

record Employee(String id,String name,int salary) {
	
}

public class FilterEmployeeBySalaryQ2 {
	public static void main(String[] args) {
		Stream<Employee> of = Stream.of(new Employee("1", "Hilal",2000),new Employee("4", "Ballu",83000));
		of.filter(e-> e.salary()>3000).forEach(System.out::println);
		
		
	}

}
