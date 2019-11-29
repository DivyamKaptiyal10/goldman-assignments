package streamProblems;
import streamProblems.Employee;
public class Problem_8 {

	public static void main(String[] args) {
		System.out.println(EmployeedDB.fetchAllEmplyees().stream()
			.filter(emp -> "Product Development".equals(emp.getDepartment()))
			.min((e1,e2) -> Integer.valueOf(e1.getAge()).compareTo(Integer.valueOf(e2.getAge()))));
	}

}
