package streamProblems;

import java.util.Calendar;
import java.util.Comparator;

public class Employee_9 {
public static void main(String[] args) {
	Comparator<Employee> c = (e1,e2) -> Integer.valueOf(e1.getYearOfJoining()).compareTo(Integer.valueOf(e2.getYearOfJoining()));
	
	System.out.println(EmployeedDB.fetchAllEmplyees().stream()
		.max(c).get().getName());
}
}
