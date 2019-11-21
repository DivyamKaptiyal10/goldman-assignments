package java8.stream;

import java8.bean.StudentDB;

public class PeekDebugging {

	public static void main(String[] args) {
		long size = StudentDB.fetchAllStudents().stream()
			.peek(student -> System.out.println("all students "+student.getName()) )
			.filter(student -> student.getAge() > 25).
			peek(student -> System.out.println("first filter "+student.getName()))
			.filter(student -> student.getName().startsWith("k"))
			.peek(student -> System.out.println("second filter "+student.getName()))
			.count();
		
		System.out.println(size);
	}
}
