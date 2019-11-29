package streamProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem_1 {

	public static void main(String[] args) {

		//method1
		long femalCount = EmployeedDB.fetchAllEmplyees().stream()
			.filter(emp -> "Female".equals(emp.getGender())).count();
		long maleCount = EmployeedDB.fetchAllEmplyees().stream()
		.filter(emp -> "Male".equals(emp.getGender())).count();
		System.out.println("male count "+maleCount+ " female count "+femalCount);
		
		//method2
		Map<String, Long> countMap = EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		
		System.out.println(countMap);
	}

}
