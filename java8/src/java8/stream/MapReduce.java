package java8.stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class MapReduce {

	public static void main(String[] args) {

		System.out.println(StudentDB.fetchAllStudents().stream().
			map(Student :: getBookCount)
			.mapToInt(v -> v)
			.sum());
	}

}
