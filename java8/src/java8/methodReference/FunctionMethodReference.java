package java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReference {
	public  static Integer length(String str) {
		return str.length();
	}
	public static void main(String[] args) {
		Function<String, Integer> f = str -> str.length();
		FunctionMethodReference fr = new FunctionMethodReference();
		Function<String, Integer> f1 = FunctionMethodReference :: length;
		//non static
		//Function<String, Integer> f1 = FunctionMethodReference :: length;
		
		Function<String, Integer> f2 = String::length;
		System.out.println(f2.apply("messi"));
	}
}
