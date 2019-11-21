package java8.methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import java8.bean.Student;

public class ConstructorReference {

	public static void main(String[] args) {
		
		//lambda
		Supplier<Student> s1= () -> new Student();
		System.out.println(s1.get());
		//method referefmce
		Supplier<Student> s2 = Student :: new;
		System.out.println(s2.get());
		
		Function<String, Student> s3 = Student :: new;
		System.out.println(s3.apply("messi"));
		
		BiFunction<String,Integer ,  Student> s4 = Student :: new;
		System.out.println(s4.apply("kaka",41));
	}
}
