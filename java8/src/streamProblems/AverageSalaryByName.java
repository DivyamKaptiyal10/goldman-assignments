package streamProblems;
import java.util.Map;
import java.util.stream.Collectors;


public class AverageSalaryByName {

	public static void main(String[] args) {

		Map<String, Double> countMap =   EmployeedDB.fetchAllEmplyees()
			.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(countMap);
	}

}
