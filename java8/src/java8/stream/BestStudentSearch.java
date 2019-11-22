package java8.stream;

import java8.bean.Student;
import java8.bean.StudentDB;

public class BestStudentSearch {

	public static void main(String[] args) {
		System.out.println(StudentDB.fetchAllStudents().stream().
			reduce((student1,student2) -> {
			if(student1.getHobbies().size() > student2.getHobbies().size()) {
				return student1;
			}else {
				return student2;
			}
			}
			).orElse(new Student()));
		
	}
}
