package streamProblems;
public class Problem1 {

	public static void main(String[] args) {

		System.out.println(	EmployeedDB.fetchAllEmplyees().stream()
					.filter(employee -> "Female".equals(employee.getGender())).count());
		
		System.out.println(	EmployeedDB.fetchAllEmplyees().stream()
				.filter(employee -> "Male".equals(employee.getGender())).count());
	}

}
