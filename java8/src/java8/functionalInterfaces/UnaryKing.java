package java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryKing {

	public static void main(String[] args) {

		UnaryOperator<String> unq = str -> str.toUpperCase();
		System.out.println(unq.apply("messi"));
		BinaryOperator<String> bnq = (str1, str2) -> str1 + str2;
		System.out.println(bnq.apply("jai ", "radha"));
		Comparator<String> sc = (str1,str2) -> str2.compareTo(str1);
		System.out.println(BinaryOperator.minBy(sc).apply("radha", "jai"));
	}

}
