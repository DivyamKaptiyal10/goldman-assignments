package java8.methodReference;

import java.util.function.BiFunction;

public class BiFunctionMethodReference {

	public static void main(String[] args) {
		BiFunction<StringBuilder, StringBuilder, StringBuilder> bi  = (str1, str2) -> str1.append(str2);
		
		BiFunction<StringBuilder, StringBuilder, StringBuilder> bi1  = StringBuilder :: append;
		
		
		System.out.println(bi1.apply(new StringBuilder("messi"), new StringBuilder("ronaldo")));
	}
}
