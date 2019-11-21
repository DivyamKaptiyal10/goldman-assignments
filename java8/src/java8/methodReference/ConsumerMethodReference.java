package java8.methodReference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import java8.bean.Student;

public class ConsumerMethodReference {

	public static void main(String[] args) {
		Consumer<String> consumer = String::toString;
		//supplier method reference
		Supplier<Student> s = () -> new Student();
		
		//method reference removed lambda
		Supplier<Student> s1  = Student :: new;
		
		System.out.println(s1.get());
		
		Function<String,Student> f = Student :: new;
		BiFunction<String, Integer, Student> f12 = Student :: new;
		System.out.println(f.apply("messi"));
		System.out.println(f12.apply("kaka", 42));
	}
}
