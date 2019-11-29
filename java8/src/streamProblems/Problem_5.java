package streamProblems;

import java.util.List;
import java.util.stream.Collectors;

public class Problem_5 {
public static void main(String[] args) {
	List<String> names = EmployeedDB.fetchAllEmplyees().stream()
			.filter(emp -> emp.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
	
	System.out.println(names);
	
	//method2
	List<String> names1 =EmployeedDB.fetchAllEmplyees().stream()
	.filter(emp -> emp.getYearOfJoining() > 2015).collect(Collectors.mapping(Employee::getName, Collectors.toList()));
	
	System.out.println(names1);
}
}
