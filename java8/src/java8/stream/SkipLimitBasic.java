package java8.stream;

import java8.bean.StudentDB;

public class SkipLimitBasic {

	public static void main(String[] args) {

		StudentDB.fetchAllStudents().stream()
			.limit(3).
			skip(1).
			forEach(System.out::println);
	}

}
