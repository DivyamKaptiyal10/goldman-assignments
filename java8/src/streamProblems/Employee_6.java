package streamProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class Employee_6 {

	public static void main(String[] args) {
		Map<String, Long> departmentCount = EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
		
		System.out.println(departmentCount);
	}

}
