package java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class AnyNoneAllMatches {

	public static void main(String[] args) {
		//anymatch
		List<Student> students= StudentDB.fetchAllStudents();
		boolean anymatch  = students.stream().anyMatch(student -> student.getAge() >=42);
		System.out.println(anymatch);
		int smallestAge = students.stream().map(Student::getAge)
				.reduce(Integer :: min).orElse(0);
		long smallestAge1 = students.stream().map(Student :: getAge).mapToInt(v -> v)
					.min().orElse(0);
		System.out.println("new small "+smallestAge1 + " old small "+smallestAge);
		
		boolean noneMatch = students.stream().noneMatch(student -> student.getAge() < smallestAge);
		System.out.println(noneMatch);
		
		boolean allMatch = students.stream().allMatch(student -> student.getAge() >= smallestAge);
		System.out.println(allMatch);
	}

}
