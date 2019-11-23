package terminalOperations.joining;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class MinByMaxBy {

	public static void main(String[] args) {
		System.out.println(StudentDB.fetchAllStudents().stream()
		.min(Comparator.comparing(Student::getAge)).orElseThrow(RuntimeException::new));
		
		Optional<Student> minStu= StudentDB.fetchAllStudents().stream()
		
		.collect(Collectors.minBy(Comparator.comparing(Student::getAge)));
		
		System.out.println(minStu.orElseThrow(RuntimeException::new));
		
		Optional<Student> maxStu= StudentDB.fetchAllStudents().stream()
				
				.collect(Collectors.maxBy(Comparator.comparing(Student::getAge)));
		
		System.out.println(maxStu.orElseThrow(RuntimeException::new));
	
	}

}
