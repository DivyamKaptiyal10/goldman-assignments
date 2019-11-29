package streamProblems;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import streamProblems.Employee;

public class Problem_14 {

	public static void main(String[] args) {
		Predicate<Employee> p = (emp) -> emp.getAge()<=25;
	Map<Boolean, List<Employee>>	part = EmployeedDB.fetchAllEmplyees().stream()
			.collect(Collectors.partitioningBy(p));

		System.out.println(part);
	}

}
