package streamProblems;

import java.util.stream.Collectors;

public class Employee_13 {

	public static void main(String[] args) {
	double average = 	EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.averagingDouble(Employee::getSalary));
	
	double total = EmployeedDB.fetchAllEmplyees().stream()
		.collect(Collectors.summingDouble(Employee::getSalary));
	
	System.out.println("average "+average + " total "+total);
	}

}
