package terminalOperations.joining;

import java.util.stream.Collectors;

import java8.bean.Student;
import java8.bean.StudentDB;

public class SumAvgCollector {

	public static void main(String[] args) {
		int sum = StudentDB.fetchAllStudents().stream()
		.mapToInt(Student::getAge).sum();
		double average = StudentDB.fetchAllStudents()
				.stream().mapToInt(Student::getAge).average().orElse(0d);
		System.out.println("old style average="+average+ " and sum="+sum);
		
		double average1 =StudentDB.fetchAllStudents().stream()
		.collect(Collectors.averagingDouble(Student::getAge));
		
		int sum1 =StudentDB.fetchAllStudents().stream()
				.collect(Collectors.summingInt(Student::getAge));
		System.out.println();
		System.out.println("new style average="+average1+ " and sum="+sum1);
	}

}
