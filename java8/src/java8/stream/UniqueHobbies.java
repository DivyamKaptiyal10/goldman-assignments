package java8.stream;

import java.util.List;

import java8.bean.Student;
import java8.bean.StudentDB;

public class UniqueHobbies {

	public static void main(String[] args) {

		StudentDB.fetchAllStudents()
		.stream()
		.map(Student :: getHobbies)
		.flatMap(List :: stream)
		.distinct()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println(StudentDB.fetchAllStudents()
		.stream()
		.map(Student :: getHobbies)
		.flatMap(List :: stream)
		.distinct()
		.sorted().count());
	}

}
