package java8.functionalInterfaces;

import java.util.function.Supplier;

import java8.bean.Student;

public class StudentSupplier {
public static void main(String[] args) {
	Supplier<Student> s1 =  Student::new;
	System.out.println(s1.get());
}
}
