package streamProblems;

import java.util.Comparator;

public class Problem_15 {

	public static void main(String[] args) {

		System.out.println(EmployeedDB.fetchAllEmplyees().stream()
			.max(Comparator.comparing(Employee::getAge)).orElseThrow(RuntimeException::new));
	}

}
