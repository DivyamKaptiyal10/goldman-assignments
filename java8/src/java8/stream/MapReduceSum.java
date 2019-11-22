package java8.stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class MapReduceSum {

	public static void main(String[] args) {
		
		System.out.println(StudentDB.fetchAllStudents().stream().
				map(Student:: getBookCount).
				reduce(0, Integer :: sum));
	}

}
