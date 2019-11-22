package java8.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class MapBasic1 {

	public static void main(String[] args) {

	List<String> names =	StudentDB.fetchAllStudents().stream()
				 .map(Student::getName).
				// distinct().
				 collect(Collectors.toList());
	
	Set<String> namesSet =	StudentDB.fetchAllStudents().stream()
			 .map(Student::getName).collect(Collectors.toSet());
	System.out.println(names);
	System.out.println(namesSet);
	}

}
