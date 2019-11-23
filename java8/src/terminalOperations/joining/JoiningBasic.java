package terminalOperations.joining;

import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class JoiningBasic {
public static void main(String[] args) {
	String names= StudentDB.fetchAllStudents().stream()
			.map(Student :: getName).collect(Collectors.joining(" "));
	System.out.println(names);
	
	
	long count = StudentDB.fetchAllStudents().stream().collect(Collectors.counting());
	System.out.println(count);
}
}
