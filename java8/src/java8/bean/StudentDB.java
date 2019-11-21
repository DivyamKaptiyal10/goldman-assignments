package java8.bean;

import java.util.Arrays;
import java.util.List;

public class StudentDB {
	
	public static List<Student> fetchAllStudents(){
		Student s1 = new Student("messi", 31, Arrays.asList("food" , "football" , "music" , "gym" , "beach"));
		
		Student s2 = new Student("kak", 42, Arrays.asList( "football" , "music" , "god" , "beach"));
		
		Student s4 = new Student("kanishk", 27, Arrays.asList("god" , "football" , "music" , "gym" , "sleep"));
		
		Student s5 = new Student("aman", 31, Arrays.asList("sleep" , "coding" , "music" , "hills" , "beach"));
		
		Student s6 = new Student("lopa", 20, Arrays.asList("food" , "clothing" , "music" , "gym" , "beach"));
	return Arrays.asList(s1,s2,s4,s5,s6);	
	}

}
