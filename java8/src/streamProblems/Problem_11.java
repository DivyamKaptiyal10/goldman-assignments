package streamProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem_11 {

	public static void main(String[] args) {
	Map<String, Double> map=	EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingDouble(Employee::getSalary)));
	System.out.println(map);
	}

}
