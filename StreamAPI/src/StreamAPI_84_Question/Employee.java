package StreamAPI_84_Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
	private static final String RED = "\033[1;31m"; // RED
	private static final String RESET = "\033[0m"; // Text Reset

	private String name;
	private int age;
	private double salary;
	private String gender;

	// Constructor
	public Employee(String name, int age, double salary, String gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	// Getters and setters for each variable
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Override toString() method for easy printing
	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + ", gender='" + gender
				+ '\'' + '}';
	}

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		List<Employee> list = new ArrayList<>();
		Employee employee1 = new Employee("Anna", 27, 50000.0, "Male");
		Employee employee2 = new Employee("Employee 2", 27, 51000.0, "Female");
		Employee employee3 = new Employee("Bob", 27, 52000.0, "Male");
		Employee employee4 = new Employee("EmplSmithoyeeee 4", 28, 53000.0, "Female");
		Employee employee5 = new Employee("Employee 5", 29, 53000.0, "Male");
		Employee employee6 = new Employee("Employee 6", 30, 55000.0, "Female");
		Employee employee7 = new Employee("EmSmithployee 7", 31, 56000.0, "Male");
		Employee employee8 = new Employee("Employee 8", 32, 57000.0, "Female");
		Employee employee9 = new Employee("Employee 9", 35, 58000.0, "Male");
		Employee employee10 = new Employee("EMPLOYEEeeseeee 10", 35, 59000.0, "Female");
		Employee employee11 = new Employee("HILAL", 22, 34000.0, "Male");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		list.add(employee8);
		list.add(employee9);
		list.add(employee10);
		list.add(employee11);

//		 1. Filter Employees by Gender:
//		 - Retrieve a list of all female employees.
		System.out.println(RED + "*****Retrieve a list of all female employees********" + RESET);
		list.stream().filter(t -> t.getGender().equals("Female")).forEach(System.out::println);

		System.out.println(RED + "*****Get a list of employees older than 30 years.********" + RESET);
//		2. Filter Employees by Age:
//			   - Get a list of employees older than 30 years.
		list.stream().filter(employee -> employee.getAge() > 30).forEach(System.out::println);

		System.out.println(RED + "*****Find employees with a salary greater than $50,000.********" + RESET);
//		3. Filter Employees by Salary:
//			   - Find employees with a salary greater than $50,000.
		list.stream().filter(employee -> employee.getSalary() > 50000).forEach(System.out::println);

//		4. Map Employee Names:
//		   - Create a list of employee names (Strings).
		System.out.println(RED + "*************Create a list of employee names (Strings)*************" + RESET);
		list.stream().map(employee -> employee.getName()).forEach(System.out::println);

//		5. Calculate Average Salary:
//		   - Calculate the average salary of all employees.
		System.out.println(RED + "*********Calculate the average salary of all employees.*******" + RESET);
		double orElseThrow = list.stream().mapToDouble(Employee::getSalary).average().orElseThrow();
		System.out.println("Average : " + orElseThrow);

//		6. Find Maximum Salary:
//		   - Find the employee with the highest salary.
		System.out.println(RED + "*********Find the employee with the highest salary.********" + RESET);
		double max = list.stream().mapToDouble(Employee::getSalary).max().orElseThrow();
		System.out.println("Max Salary : " + max);

//		7.Group Employees by Gender:
//		   - Group employees by gender and return
//		   a map with gender as the key and a list of employees as the value.
		System.out.println(RED + "******Group employees by gender and return a map******" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender))
				.forEach((key, value) -> System.out.println(key + " - " + value));

//		8. Count Male Employees:
//		   - Count the number of male employees.
		System.out.println(RED + "**********Count the number of male employees.*********" + RESET);
		long count = list.stream().filter(employee -> employee.getGender().equals("Male")).count();
		System.out.println("Count : " + count);

//		9. Sum of All Salaries:
//		   - Calculate the total sum of salaries for all employees.
		System.out.println(RED + "*********Calculate the total sum of salaries for all employees.**********" + RESET);
		double sum = list.stream().mapToDouble(employee -> employee.getSalary()).sum();
		System.out.println("Sum : " + sum);

//		10. Sort Employees by Name:
//	    - Sort the employees by their names in alphabetical order.
		System.out.println(RED + "*******Sort the employees by their names in alphabetical order.*****" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

//		11. Sort Employees by Age:
//	    - Sort the employees by age in ascending order.
		System.out.println(RED + "**********Sort the employees by age in ascending order.********" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

//		12. Sort Employees by Salary:
//	    - Sort the employees by salary in descending order.
		System.out.println(RED + "*********Sort the employees by salary in descending order.******" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).forEach(System.out::println);

//		13. Find Oldest Employee:
//	    - Find the oldest employee.
		System.out.println(RED + "*********Find the oldest employee.*********" + RESET);
		int orElseThrow2 = list.stream().mapToInt(Employee::getAge).max().orElseThrow();
		Employee employee = list.stream().max((e1, e2) -> (e1.getAge() - e2.getAge())).get();
		System.out.println(employee);
		System.out.println("Max Age : " + orElseThrow2);

//	14. Group Employees by Age:
//    - Group employees into age groups (e.g., 20-30, 31-40, etc.)
//    and return a map with age group as the key and a list of employees as the value.
		System.out.println(RED + "****Group employees into age groups (e.g., 20-30, 31-40, etc.)*****" + RESET);
		list.stream().collect(Collectors.groupingBy((t) -> {
			int age = t.getAge();
			if (age >= 20 && age <= 30)
				return "20-30";
			else if (age >= 31 && age <= 40)
				return "31-40";
			else
				return "40+";
		})).forEach((key, value) -> System.out.println(key + " - " + value));

//		15. Find Employees with a Specific Age:
//	    - Find all employees who are exactly 35 years old.
		System.out.println(RED + "************ Find all employees who are exactly 35 years old.***********" + RESET);
		list.stream().filter(k -> k.getAge() == 35).forEach(System.out::println);

//		16. Calculate the Sum of Salaries by Gender:
//	    - Calculate the sum of salaries for each gender (i.e., male and female)
//	    and return a map with gender as the key and the sum of salaries as the value.
		System.out.println(RED + "********* Calculate the sum of salaries for each gender**********" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.summingDouble(Employee::getSalary)))
				.forEach((key, value) -> System.out.println(key + " - " + value));

//		17. Find Employees with Names Starting with "J":
//	    - Find all employees whose names start with the letter "E."
		System.out.println(RED + "*********Find all employees whose names start with the letter J******" + RESET);
		list.stream().filter(k -> k.getName().startsWith("E")).forEach(System.out::println);

//		18. Calculate the Average Salary for Male and Female Employees:
//	    - Calculate the average salary separately for male
//	    and female employees and return a map with gender
//	    		as the key and the average salary as the value.
		System.out.println(
				RED + "**********Calculate the average salary separately for male and female*********" + RESET);
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((key, value) -> System.out.println(key + " - " + value));

//		19. Find the Top N Highest Paid Employees:
//	    - Find the top N employees with the highest salaries.

		System.out.println(RED + "*******Find the top N employees with the highest salaries.********" + RESET);
		list.stream().sorted((o1, o2) -> -(int) (o1.getSalary() - o2.getSalary())).limit(5)
				.forEach(System.out::println);

		list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
				.forEach(System.out::println);
		System.out.println("======================================");

//		20. Retrieve Distinct Age Values:
//	    - Get a list of distinct ages of all employees.
		System.out.println(RED + "*********Get a list of distinct ages of all employees.*********" + RESET);

		list.stream().filter(k -> !set.add(k.getAge())).forEach(System.out::println);
		System.out.println("======================================");

//		21. Find the Three Lowest-Paid Employees:
//		   - Find and display the names of the three employees with the lowest salaries.
		System.out.println(RED
				+ "*******Find and display the names of the three employees with the lowest salaries.********" + RESET);
		list.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).map(k -> k.getName()).limit(3)
				.forEach(System.out::println);
		System.out.println("======================================");

//		22. Sort Employees by Name Length:
//		   - Sort employees by the length of their names (shortest to longest).
		System.out.println(
				RED + "***********Sort employees by the length of their names (shortest to longest).*******" + RESET);
		list.stream().sorted((o1, o2) -> (o1.getName().length() - o2.getName().length())).forEach(System.out::println);
		System.out.println("======================================");

//		23. Group Employees by Age Range:
//		   - Group employees into custom
//		   age ranges (e.g., 20-29, 30-39, etc.) and
//		   return a map with the age range as the key and a list of employees as the value.
		System.out.println(
				RED + "*********Group employees into custom age ranges (e.g., 20-29, 30-39, etc.)*********" + RESET);
		list.stream().collect(Collectors.groupingBy((t) -> {
			int age = (t).getAge();
			if (age >= 20 && age <= 29)
				return "20-29";
			else if (age >= 30 && age <= 39)
				return "30-39";
			else
				return "40+";
		})).forEach((key, value) -> System.out.println(key + " - " + value));
		System.out.println("======================================");

//		24. Find the Average Salary of Employees Aged 30 or Younger:
//		   - Calculate the average salary of employees aged 30 or younger.

		System.out.println(RED + "********Calculate the average salary of employees aged 30 or younger.******" + RESET);
		double orElseThrow21 = list.stream().filter(emp -> emp.getAge() <= 30).mapToDouble(k -> k.getSalary()).average()
				.orElseThrow();
		System.out.println(orElseThrow21);
		System.out.println("======================================");

//		25. Find the Names of Male Employees with Salaries Over $60,000:
//		   - Retrieve the names of male employees with salaries over $60,000.
		System.out.println(
				RED + "**********Retrieve the names of male employees with salaries over $53,000.***********" + RESET);
		list.stream().filter(e -> e.getSalary() >= 53000 && e.getGender().equals("Male")).map(k -> k.getName())
				.forEach(System.out::println);
		System.out.println("======================================");

//		26. Find the Youngest Female Employee:
//		   - Find the youngest female employee.
		System.out.println(RED + "**********Find the youngest female employee.**********" + RESET);
		Employee employee21 = list.stream().filter(k -> k.getGender().equals("Female"))
				.collect(Collectors.minBy((o1, o2) -> o1.getAge() - o2.getAge())).get();
		System.out.println(employee21);
		System.out.println("======================================");

//		27. Retrieve the Names of Employees in Reverse Order:
//		   - Get a list of employee names in reverse order (from the last employee to the first).
		System.out.println(RED + "******Get a list of employee names in reverse order*******" + RESET);
		List<String> collect = list.stream().map(k -> k.getName()).collect(Collectors.toList());
		Collections.reverse(collect);
		System.out.println(collect);
		System.out.println("======================================");

//		28. Find the Highest Salary Among Female Employees:
//		   - Find the highest salary among female employees.
		System.out.println(RED + "******Find the highest salary among female employees." + RESET);
		Employee employee31 = list.stream().filter(k -> k.getGender().equals("Female"))
				.collect(Collectors.maxBy((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()))).get();
		System.out.println(employee31);
		System.out.println("======================================");

//		29. Group Employees by Age and Gender:
//		   - Group employees by both age and gender and return a multi-level map.
		System.out.println(
				RED + "********Group employees by both age and gender and return a multi-level map.*****" + RESET);
		Map<String, Map<Integer, List<Employee>>> collect2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getAge)));

		collect2.forEach((key, value) -> {
			value.forEach((k, v) -> System.out.println(k + "-" + v));
		});
		// System.out.println(key + "-" + value)};
		System.out.println("======================================");

//			30. Find the Sum of Salaries for Employees with Names Containing "Smith":
//			   - Calculate the sum of salaries for employees whose names contain the substring "Smith."
		System.out.println(
				RED + "******* Calculate the sum of salaries for employees whose names contain the substring Smith***"
						+ RESET);
		double sum2 = list.stream().filter(k -> k.getName().contains("Smith")).mapToDouble(k -> k.getSalary()).sum();
		System.out.println(sum2);
		System.out.println("======================================");

//			31. Find the Names of Employees Aged 30-40 with Salaries Between $50,000 and $60,000:
//			   - Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.
		System.out.println(RED
				+ "******Retrieve the names of employees aged 30-40 with salaries between $50,000 and $60,000.*******"
				+ RESET);
		list.stream().filter(
				k -> (k.getAge() >= 30 && k.getAge() <= 40) && (k.getSalary() >= 52000 && k.getSalary() <= 60000))
				.forEach(System.out::println);
		System.out.println("======================================");

//			32. Calculate the Total Number of Employees:
//				   - Determine the total count of employees.

		System.out.println(RED + "******** Determine the total count of employees.*******" + RESET);
		System.out.println("Total Count of employess : " + list.stream().count());

		System.out.println("======================================");

//			33. Find the Most Common Age Among Employees:
//				   - Determine the age that is most common among the employees.
		System.out.println(RED + "******Determine the age that is most common among the employees.***" + RESET);
		Integer orElseThrow3 = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting())) // grouping
				// ages
				// and
				// count
				.entrySet() // converting to set
				.stream().max(Map.Entry.comparingByValue()) // finding max value in map
				.map(Map.Entry::getKey) // getting key of max value
				.orElseThrow(); // getting the key
		System.out.println(orElseThrow3);

		System.out.println("======================================");

//			34. Find the Median Salary:
//			   - Calculate the median salary of all employees.

		System.out.println(RED + "********Calculate the median salary of all employees.******" + RESET);
		List<Employee> list2 = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).toList();
		int size = list2.size();
		if (size % 2 == 0) {
			double s = list2.get(size / 2 - 1).getSalary();
			double s1 = list2.get(size / 2).getSalary();
			System.out.println((s + s1) / 2.0);
		} else {
			System.out.println(list2.get(size / 2).getSalary());
		}
		System.out.println("======================================");

		// 35. Group Employees by Age and Count: - Group employees by age and count the
		// number of employees in each age group.
		System.out.println(RED + "******* Group employees by age and count ******" + RESET);
		System.out.println(RED + "******* Group employees by age and count ******" + RESET);

		Map<Integer, Long> ageGroupCounts = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()));

		// Use distinct parameter names to avoid conflicts
		ageGroupCounts.forEach((ageKey, employeeCount) -> System.out.println(ageKey + " - " + employeeCount));

		System.out.println("======================================");

		// 36. Find the Employee with the Longest Name: - Find the employee with the
		// longest name.
		System.out.println(RED + "********Find the employee with the longest name.****" + RESET);
		Employee LongestName = list.stream().max((o1, o2) -> o1.getName().length() - o2.getName().length()).get();
		System.out.println(LongestName);

		System.out.println("======================================");

		// 37. Calculate the Sum of Salaries for Each Age: - Calculate the sum of
		// salaries for each distinct age in a map.
		System.out.println(
				RED + "*********** Calculate the sum of salaries for each distinct age in a map ***********" + RESET);

		Map<Integer, Double> salaryByAge = list.stream()
				.collect(Collectors.groupingBy(Employee::getAge, Collectors.summingDouble(Employee::getSalary)));

		salaryByAge.forEach((age, totalSalary) -> System.out.println(age + " - " + totalSalary));
		System.out.println("======================================");

		// 38. Sort Employees by Age, Then by Salary: - Sort employees first by age in
		// ascending order, and then by salary in
		// descending order.
		System.out.println(RED
				+ "**********Sort employees first by age in ascending order, and then by salary in descending order*******"
				+ RESET);
		list.stream()
				.sorted(Comparator.comparingInt(Employee::getAge)
						.thenComparing(Comparator.comparingDouble(Employee::getSalary).reversed()))
				.forEach(System.out::println);

		System.out.println("======================================");

		// 39. Find Employees Whose Names Contain More Than One Word: - Retrieve
		// employees whose names consist of more than one word.
		System.out
				.println(RED + "***********Retrieve employees whose names consist of more than one word.*****" + RESET);
		list.stream().filter(k -> k.getName().length() > 1).forEach(System.out::println);

		System.out.println("======================================");

		// 40. Find the Two Highest Paid Female Employees: - Find and display the names
		// of the two highest-paid female employees.
		System.out.println(
				RED + "**********Find and display the names of the two highest-paid female employees.*****" + RESET);
		list.stream().filter(k -> k.getGender().equals("Female"))
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2)
				.forEach(System.out::println);

		System.out.println("======================================");

		// 41. Find the Employee with the Highest Salary in Each Gender: - Find the
		// employee with the highest salary for each gender (male and female)
		// System.out.println(RED + "****** Find the employee with the highest salary
		// for each gender ******" + RESET);

//			list.stream().collect(Collectors.groupingBy(
//					Employee::getGender, Collectors.summingDouble(Employee::getSalary)));
//
		// highestPaidByGender.forEach((gender, employeeOpt) ->System.out.println());

		System.out.println("======================================");

		// 42. Retrieve Employees with Unique Names: - Find employees with unique names
		// (no duplicate names in the list).
		System.out
				.println(RED + "*******Find employees with unique names (no duplicate names in the list).****" + RESET);
		list.stream().filter(k -> set2.add(k.getName())).forEach(System.out::println);
		set2.clear();

		System.out.println("======================================");

		// 43. Find the Names of Employees in Uppercase: - Get a list of employee names
		// in uppercase.
		System.out.println(RED + "*******Get a list of employee names in uppercase.*****" + RESET);
		list.stream().filter(k -> k.getName().equals(k.getName().toUpperCase())).forEach(System.out::println);

		System.out.println("======================================");

		// 44. Calculate the Salary Range (Min-Max) for Each Age Group: - Calculate the
		// salary range (minimum and maximum) for each distinct
		System.out.println(RED
				+ "****** Calculate the salary range (minimum and maximum) for each distinct age group ******" + RESET);

		Map<Integer, Map<String, Double>> salaryRangeByAge = list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.collectingAndThen(Collectors.toList(), employees -> {
					double min = employees.stream().mapToDouble(Employee::getSalary).min().orElseThrow();

					double max1 = employees.stream().mapToDouble(Employee::getSalary).max().orElseThrow();

					Map<String, Double> map = new HashMap<>();
					map.put("min", min);
					map.put("max", max1);
					return map;
				})));

		System.out.println("===================");
		salaryRangeByAge.forEach((age, salary) -> System.out
				.println("Age: " + age + " - Min Salary: " + salary.get("min") + ", Max Salary: " + salary.get("max")));

		// 45. Filter Employees by First Name Initial: - Retrieve employees whose first
		// name starts with a specific initial (e.g.,
		System.out.println(
				RED + "********Retrieve employees whose first name starts with a specific initial (e.g., 'E').******"
						+ RESET);
		list.stream().filter(k -> k.getName().startsWith("E")).forEach(System.out::println);

		System.out.println("===================");

		// 46. Group Employees by Age and List Only Unique Salaries: - Group employees
		// by age and display a list of unique salaries for each
		System.out.println(
				RED + "********Group employees by age and display a list of unique salaries for each age group.*****"
						+ RESET);
		list.stream()
				.collect(Collectors.groupingBy(Employee::getAge,
						Collectors.mapping(Employee::getSalary, Collectors.toSet())))
				.forEach((key, value) -> System.out.println("Age : " + key + " Salary : " + value));
		System.out.println("===================");

		// 47. Find Employees with the Same Salary: - Identify and display employees who
		// have the same salary.
		System.out.println(RED + "*****Identify and display employees who have the same salary.****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream() // k is entry
				.filter(k -> k.getValue().size() > 1).forEach(entry -> // Map (Double , List<>)
				{
					System.out.println(entry.getKey());
					entry.getValue().forEach(System.out::println);
				});
		System.out.println("===================");

		// 48. Find the Employee with the Shortest Name Among Male Employees: - Find the
		// male employee with the shortest name.
		System.out.println(RED + "******Find the male employee with the shortest name.******" + RESET);
		Employee emp = list.stream().filter(k -> k.getGender().equals("Male"))
				.max((o1, o2) -> Integer.compare(o1.getName().length(), o2.getName().length())).orElseThrow();
		System.out.println(emp);
		System.out.println("===================");

		//
		//

		// 49. Find the Most Common Salary Value: - Determine the salary value that
		// appears most frequently among the
		System.out.println(
				RED + "************Determine the salary value that appears most frequently among the employees.********"
						+ RESET);
		Double orElseThrow4 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
		System.out.println(orElseThrow4);

		// 50. Find the Oldest Employee with the Lowest Salary: - Find the oldest
		// employee with the lowest salary.
		System.out.println(RED + "*******Find the oldest employee with the lowest salary.******" + RESET);
		Employee emp1 = list.stream()
				.filter(k -> k.getAge() == list.stream().mapToInt(Employee::getAge).max().orElseThrow())
				.min(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(emp1);

		System.out.println("===================");

		// 51. Filter Employees by Gender: - Retrieve a list of all female employees.
		System.out.println(RED + "****** Retrieve a list of all female employees.****" + RESET);
		list.stream().filter(k -> k.getGender().equals("Female")).forEach(System.out::println);

		System.out.println("==========================");

		// 52. Filter Employees by Age:
		// - Get a list of employees older than 30 years.
		System.out.println(RED + "*************Get a list of employees older than 30 years.********" + RESET);
		list.stream().filter(k -> k.getAge() > 30).forEach(System.out::println);
		System.out.println("==========================");

		// 53. Filter Employees by Salary: - Find employees with a salary greater than
		// $50,000.
		System.out.println(RED + "******Find employees with a salary greater than $50,000.******" + RESET);
		list.stream().filter(k -> k.getSalary() > 50000).forEach(System.out::println);

		// 54. Map Employee Names: - Create a list of employee names (Strings).
		System.out.println(RED + "******Create a list of employee names (Strings).******" + RESET);
		list.stream().map(k -> k.getName()).toList().forEach(System.out::println);

		// 56. Find Maximum Salary: - Find the employee with the highest salary.
		System.out.println(RED + "********Find the employee with the highest salary.********" + RESET);
		Employee emp3 = list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println(emp3);

		// 57. Group Employees by Gender: - Group employees by gender and return a map
		// with gender as the key and a list of employees as the
		System.out.println(RED + "*********return a map with gender as the key and a list  of employees*****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 58. Count Male Employees: - Count the number of male an female employees.
		System.out.println(RED + "****Count the number of male and female employees.*****" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 59. Sum of All Salaries: - Calculate the total sum of salaries for all
		// employees.
		System.out.println(RED + "******Calculate the total sum of salaries for all ees.*****" + RESET);
		Double collect4 = list.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(collect4);

		// 60. Sort Employees by Name: - Sort the employees by their names in
		// alphabetical order.
		System.out.println(RED + "****** Sort the employees by their names in alphabetical order.******" + RESET);
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		// 61. Find the Employee with the Highest Salary in Each Gender: - Find the
		// employee with the highest salary for each gender (male and
		System.out.println(RED
				+ "*******Find the employee with the highest salary for each gender (male and female).*****" + RESET);
		list.stream()
				.collect(
						Collectors.toMap(Employee::getGender, t -> t, (t, u) -> t.getSalary() >= u.getSalary() ? t : u))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 62. Retrieve Employees with Unique Names: - Find employees with unique names
		// (no duplicate names in the list).
		System.out.println(
				RED + "*******Find employees with unique names (no duplicate names in the list).******" + RESET);
		list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting())).entrySet().stream()
				.filter(k -> k.getValue() == 1).forEach(k -> System.out.println(k.getKey()));

		// 63. Find the Names of Employees in Uppercase: - Get a list of employee names
		// in uppercase.
		System.out.println(RED + "******Get a list of employee names in uppercase.******" + RESET);
		list.stream().filter(k -> k.getName().equals(k.getName().toUpperCase())).forEach(System.out::println);

		//
		//

		// 64. Calculate the Salary Range (Min-Max) for Each Age Group: - Calculate the
		// salary range (minimum and maximum) for each distinct
		System.out.println(RED
				+ "*******Calculate the salary range (minimum and maximum) for each distinct age group.******" + RESET);
		Map<Integer, Map<String, Double>> collect5 = list.stream().collect(
				Collectors.groupingBy(Employee::getAge, Collectors.collectingAndThen(Collectors.toList(), k -> {
					Double maxx = k.stream().mapToDouble(k2 -> k2.getSalary()).max().getAsDouble();
					Double min = k.stream().mapToDouble(k1 -> k1.getSalary()).min().getAsDouble();
					Map<String, Double> map = new HashMap<>();
					map.put("max", maxx);
					map.put("min", min);
					return map;
				})));
		collect5.forEach((age, map) -> {
			System.out.print("Age : " + age + " - ");
			System.out.println("Minimum : " + map.get("min") + " Maximum : " + map.get("max"));

			// 65. Filter Employees by First Name Initial: - Retrieve employees whose first
			// name starts with a specific initial (e.g.,
			System.out.println(RED
					+ "**********Retrieve employees whose first name starts with a specific initial *******" + RESET);
			list.stream().filter(k -> k.getName().startsWith("E")).forEach(System.out::println);

			// 66. Group Employees by Age and List Only Unique Salaries: - Group employees
			// by age and display a list of unique salaries for each
			System.out.println(RED
					+ "*******Group employees by age and display a list of  unique salaries for each age group.******"
					+ RESET);
			list.stream()
					.collect(Collectors.groupingBy(Employee::getAge,
							Collectors.mapping(Employee::getSalary, Collectors.toSet())))
					.forEach((k, v) -> System.out.println(k + " - " + v));

			// 67. Find Employees with the Same Salary: - Identify and display employees who
			// have the same salary.
			System.out.println(RED + "********Identify and display employees who have the same salary.****" + RESET);
			list.stream().collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
					.filter(k -> k.getValue().size() > 1).forEach(t -> {
						System.out.println(t.getKey() + " " + t.getValue());
					});
		});

		// 68. Find the Employee with the Shortest Name Among Male Employees: - Find the
		// male employee with the shortest name.
		System.out.println(RED + "********Find the male employee with the shortest name.*****" + RESET);
		Employee emp4 = list.stream().filter(k -> k.getGender().equals("Male"))
				.min(Comparator.comparing(Employee::getName)).get();
		System.out.println(emp4);

		// 69. Find the Most Common Salary Value: - Determine the salary value that
		// appears most frequently among the
		System.out.println(
				RED + "*******Determine the salary value that appears most frequently among the employees.********"
						+ RESET);
		Double double1 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
		System.out.println(double1);

		// 70. Find the Oldest Employee with the Lowest Salary: - Find the oldest
		// employee with the lowest salary.
		System.out.println(RED + "*******Find the oldest employee with the lowest salary.*****" + RESET);
		Employee emp5 = list.stream()
				.filter(k -> k.getAge() == list.stream().mapToInt(Employee::getAge).max().getAsInt())
				.min(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(emp5);

		// 71. Find the Most Common Age Among Employees: - Determine the age that is
		// most common among the employees.
		System.out.println(RED + "*******Determine the age that is most common among the employees.*****" + RESET);
		Integer integer = list.stream().collect(Collectors.groupingBy(Employee::getAge, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();
		System.out.println(integer);

		// 72. Find the Employee with the Longest Name: - Find the employee with the
		// longest name.
		System.out.println(RED + "******Find the employee with the longest name.****" + RESET);
		Employee emp6 = list.stream().max(Comparator.comparingInt(value -> value.getName().length())).get();
		System.out.println(emp6);

		// 73. Find Employees with Palindromic Names: - Retrieve employees whose names
		// are palindromes (e.g., "Anna" or
		System.out.println(RED + "******Retrieve employees whose names are palindromes*****" + RESET);
		list.stream().filter(k -> {
			String mainString = k.getName().toLowerCase();
			StringBuffer sr = new StringBuffer(mainString);
			return mainString.contentEquals(sr.reverse());
		}).forEach(System.out::println);

		// 74. Calculate the Sum of Salaries for Employees with Odd Ages: - Calculate
		// the sum of salaries for employees with odd ages.
		System.out.println(RED + "*********the sum of salaries for employees with odd ages.******" + RESET);
		double sum3 = list.stream().filter(k -> k.getAge() % 2 != 0).mapToDouble(Employee::getSalary).sum();
		System.out.println(sum3);

		// 75. Find the Employee with the Highest Salary Whose Name Contains "Smith": -
		// Find the employee with the highest salary whose name contains the
		System.out.println(
				RED + "******Find the employee with the highest salary whose name contains the word \"Smith.\"*******"
						+ RESET);
		Employee emp7 = list.stream().filter(k -> k.getName().contains("Smith"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(emp7);

		// 76. Group Employees by the First Letter of Their Names: - Group employees by
		// the first letter of their names and return a map with the letter as the key
		// and a list of employees as the value.
		System.out.println(RED + "*****Group employees by the first letter of their names****" + RESET);
		list.stream().collect(Collectors.groupingBy(t -> t.getName().charAt(0)))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 77. Find the Employee with the Shortest Name: - Find the employee with the
		// shortest name.
		System.out.println(RED + "*******Find the employee with the shortest name.*****" + RESET);
		Employee employee12 = list.stream().min(Comparator.comparingInt(value -> value.getName().length())).get();
		System.out.println(employee12);

		// 78. Calculate the Average Salary of Employees Whose Names Start with "E": -
		// Calculate the average salary of employees whose names start with the
		System.out.println(RED
				+ "******Calculate the average salary of employees whose names start with the letter \"E.\"" + RESET);
		Double collect6 = list.stream().filter(k -> k.getName().startsWith("E"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect6);

		// 79. Filter Employees by Age Range: - Filter employees based on a custom age
		// range (e.g., between 25 and 35 years old).
		System.out.println(RED + "*******based on a custom age range (e.g., between 25 and 35 years old)*****" + RESET);
		list.stream().filter(k -> k.getAge() >= 25 && k.getAge() <= 35).forEach(System.out::println);

		// 80. Group Employees by the First Two Letters of Their Names: - Group
		// employees by the first two letters of their names and return a map with the
		// letters as the key and a list of employees as the
		System.out.println(RED + "*****Group employees by the first two letters*****" + RESET);
		list.stream().collect(Collectors.groupingBy(k -> k.getName().substring(0, 2)))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 81. Find the Employee with the Longest Name Whose Salary Is Below $70,000:
		// - Find the employee with the longest name whose salary is below $70,000.
		System.out.println(
				RED + "*******Find the employee with the longest name whose salary is below $70,000.**" + RESET);
		Employee employee13 = list.stream().filter(k -> k.getSalary() < 70000)
				.max(Comparator.comparingInt(k -> k.getName().length())).get();
		System.out.println(employee13);

		// 82. Calculate the Average Salary of Employees Whose Names End with "son": -
		// Calculate the average salary of employees whose names end with the
		System.out.println(RED
				+ "*******Calculate the average salary of employees whose names end with the suffix \"son.\"" + RESET);
		Double collect7 = list.stream().filter(k -> k.getName().endsWith("na"))
				.collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println(collect7);

		// 83. Group employees by the number of words in their names (e.g., one-word
		// names, two-word names, etc.) and return a map with the count as the key and a
		// list of employees as the value.
		list.stream().collect(Collectors.groupingBy(k -> k.getName().length()))
				.forEach((k, v) -> System.out.println(k + " - " + v));

		// 84. Calculate the Average Salary of Employees Whose Names Contain Both "A" -
		// Calculate the average salary of employees whose names contain both the
		// letters "A" and "E."
		System.out.println(RED
				+ "********the average salary of employees whose names contain both the letters \"A\" and \"E.\"**********"
				+ RESET);
		double asDouble = list.stream().filter(k -> k.getName().contains("A") && k.getName().contains("E"))
				.mapToDouble(Employee::getSalary).average().orElse(0.0);
		System.out.println(asDouble);

	}
}