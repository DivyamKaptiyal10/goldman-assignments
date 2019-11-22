package java8.stream;

import java.util.List;
import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class FlatMapBasics {

	public static void main(String[] args) {
		//flatmap is used when we have stream<List<obj> and not stream<obj>
		
		
		List<String> allHobies = StudentDB.fetchAllStudents().stream()
			.map(Student::getHobbies) // returns stream<List<Student>>
			.flatMap(hobyList -> hobyList.stream())
			.distinct()
			.collect(Collectors.toList());
		
		System.out.println(allHobies);
	}
}
