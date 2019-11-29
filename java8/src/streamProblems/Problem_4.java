package streamProblems;

import java.util.Comparator;
import streamProblems.Employee;

public class Problem_4 {

	public static void main(String[] args) {
		Comparator<Employee> c = (emp1,emp2) -> {
			Double s1= emp1.getSalary();
			Double s2= emp2.getSalary();
			return s1.compareTo(s2);
		};
		
		Employee emp = EmployeedDB.fetchAllEmplyees().stream()
			.max(c).get();
		System.out.println(emp.getName());
	}

}
