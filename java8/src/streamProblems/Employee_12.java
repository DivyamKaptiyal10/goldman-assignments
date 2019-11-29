package streamProblems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_12 {

	public static void main(String[] args) {
	Map<String, List<String>>	map = EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.groupingBy(Employee::getDepartment , Collectors.mapping(Employee::getName, Collectors.toList())));
	
	System.out.println(map);
	}

}
