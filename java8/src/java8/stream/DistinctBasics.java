package java8.stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class DistinctBasics {

	public static void main(String[] args) {
		
		StudentDB.fetchAllStudents()
		.stream().distinct().map(Student::getName)
			.forEach(System.out::println);
	}
}
