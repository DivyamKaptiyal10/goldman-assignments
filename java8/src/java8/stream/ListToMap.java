package java8.stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class ListToMap {

	public static void main(String[] args) {
		Predicate<Student> p1 =(student) -> {
			System.out.println("jai p1");
			return student.getAge() >= 25;
		};
		Predicate<Student> p2 =(student) -> {
			System.out.println("jai p2");
			return student.getName().startsWith("k");
		};
		
		//lazy calling, untill terminal operation is called none intermediate operatoions are called
		/*
		 * StudentDB.fetchAllStudents().stream() .filter(p1.and(p2));
		 */
		
		Stream<Student> studentStream = StudentDB.fetchAllStudents().stream();
		  Map<String, List<String>> entries= studentStream
		  .filter(p1.and(p2)) .collect(Collectors.toMap(Student :: getName, Student ::
		  getHobbies));
		 
		 
		  //can not traverse stream after termination
		
		/*
		 * entries.entrySet().forEach(System.out::println);
		 * studentStream.forEach(System.out::println);
		 */
	}

}
