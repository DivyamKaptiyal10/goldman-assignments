package streamProblems;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem2 {

	public static void main(String[] args) {
		Map<String, List<Employee>> lapa =  EmployeedDB.fetchAllEmplyees().stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		lapa.keySet().forEach(System.out::println);
		System.out.println();
		
		 EmployeedDB.fetchAllEmplyees().stream().map(Employee::getDepartment).distinct()
		 .forEach(System.out::println);
	}

}
