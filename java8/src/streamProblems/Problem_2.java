package streamProblems;

public class Problem_2 {

	public static void main(String[] args) {

		EmployeedDB.fetchAllEmplyees().stream()
				.map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

}
