package streamProblems;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem3 {

	public static void main(String[] args) {
		Map<String, Double> map =EmployeedDB.fetchAllEmplyees().stream()
				.collect(Collectors.groupingBy(Employee::getGender,
						Collectors.averagingDouble(Employee::getAge)
						));
		System.out.println(map);
				
	}
}
