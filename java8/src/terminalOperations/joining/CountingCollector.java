package terminalOperations.joining;

import java.util.stream.Collectors;

import java8.bean.StudentDB;

public class CountingCollector {
public static void main(String[] args) {
	long count = StudentDB.fetchAllStudents().stream().collect(Collectors.counting());
	System.out.println(count);
}
}
