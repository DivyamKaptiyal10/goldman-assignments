package java8.stream;

import java.util.List;
import java.util.stream.Stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class StreamVsCollection {

	public static void main(String[] args) {
		List<Student> students = StudentDB.fetchAllStudents();
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		for(Student s: students) {
			System.out.println(s);
		}
		
		Stream<Student> studentStream = students.stream();
		//can not process more than once, one time use is stream
		//studentStream.filter(student -> student.getAge() > 30);
		
		studentStream.filter(student -> student.getAge() > 30).forEach(System.out::println);
	}
}
