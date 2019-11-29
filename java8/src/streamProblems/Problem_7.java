package streamProblems;

import java.util.Map;
import java.util.stream.Collectors;

public class Problem_7 {

	public static void main(String[] args) {
		Map<String, Double> aveageSalaryBydepartment = EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(aveageSalaryBydepartment);
	}
}
