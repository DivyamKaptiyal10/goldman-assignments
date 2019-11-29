package streamProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem_10 {

	public static void main(String[] args) {
		Map<String, Long> map = EmployeedDB.fetchAllEmplyees().stream()
			.filter(emp -> "Sales And Marketing".equals(emp.getDepartment()))
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}

}
