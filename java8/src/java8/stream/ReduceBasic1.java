package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import java8.bean.Student;
import java8.bean.StudentDB;

public class ReduceBasic1 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,3,4,5,6,7,2);
		List<Integer> mulnums = Arrays.asList(1,3,4,5,6,7,2);
		
		Integer sum = nums.stream().reduce(0, (a,b) -> a+b);
		System.out.println("sum is "+sum);
		
		Optional<Integer> multiply = mulnums.stream().reduce( (a,b) -> a*b);
		
		System.out.println("mul "+multiply.orElse(23));
		
		Optional<Student> nameStu= StudentDB.fetchAllStudents().stream().
				reduce((student1,student2 ) -> new Student(student1.getName()+" "+ student2.getName()));
		System.out.println("name su "+nameStu.orElse(new Student("false")));
	}

}
