package java8.stream;

import java8.bean.StudentDB;

public class FindAnyFindFirstExample {

	public static void main(String[] args) {
		System.out.println(
		StudentDB.fetchAllStudents()
		.stream().
		filter(student -> student.getAge() > 40).
		findFirst().orElseThrow(() -> new RuntimeException("Student Not Found")));
		
		
	}

}
