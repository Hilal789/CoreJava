package Map_06_06_25;

import java.util.HashMap;
import java.util.Map;

public class StudentIDManagement {
	public static void main(String[] args) {
		// Creating a HashMap to store student names and their IDs
		HashMap<String, Integer> studentRecords = new HashMap<>();

		// Adding students to the records
		studentRecords.put("John", 101);
		studentRecords.put("Alice", 102);

		// Printing initial records
		System.out.println("Initial Records:");
		printRecords(studentRecords);

		// Adding student if absent
		studentRecords.putIfAbsent("Bob", 103);

		System.out.println("\nUpdated Records after adding Bob:");
		printRecords(studentRecords);

		// Trying to add John again
		studentRecords.putIfAbsent("John", 104);

		System.out.println("\nTrying to add John with ID 104 again (should not add):");
		printRecords(studentRecords);
	}

	// Method to print student records
	public static void printRecords(HashMap<String, Integer> records) {
		records.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
	}
}