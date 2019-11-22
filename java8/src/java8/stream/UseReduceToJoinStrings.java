package java8.stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class UseReduceToJoinStrings {

	public static void main(String[] args) {
		String names = StudentDB.fetchAllStudents().stream().
			map(Student :: getName).reduce((name1,name2) -> name1+ "," + name2)
			.orElse("empty hai")
			;
			System.out.println(names);
	}

}
