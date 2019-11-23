package terminalOperations.joining;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class CollectorMapping {
public static void main(String[] args) {
	Set<String> ka = StudentDB.fetchAllStudents().stream().filter(student -> student.getName().startsWith("k"))
					.map(Student::getName).collect(Collectors.toSet());
	System.out.println(ka);
	
	Set<String> ka1 = StudentDB.fetchAllStudents().stream().filter(student -> student.getName().startsWith("k"))
	.collect(Collectors.mapping(Student::getName, Collectors.toSet()));
	System.out.println(ka1);
}
}
