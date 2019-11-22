package java8.stream;

import java.util.Comparator;

import java8.bean.Student;
import java8.bean.StudentDB;

public class CustomSort {

	public static void main(String[] args) {
		Comparator<Student> cr1 = (student1 , student2) -> student1.getName().compareTo(student2.getName());
		Comparator<Student> cr2 = (student1 , student2) -> student2.getName().compareTo(student1.getName());
		StudentDB.fetchAllStudents()
		.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println("sorting using comparing ");
		StudentDB.fetchAllStudents()
		.stream()
		.sorted(Comparator.comparing(Student :: getName).reversed())
		.forEach(System.out::println);
	}

}
