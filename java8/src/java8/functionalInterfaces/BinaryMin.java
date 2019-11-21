package java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryMin {

	public static void main(String[] args) {
		BinaryOperator<Integer> bin = (item1,item2) -> item1 + item2;
		
		System.out.println(bin.apply(23, 23));
		Comparator<Integer> c = (a1,a2) -> a2.compareTo(a1);
		System.out.println(BinaryOperator.minBy(c).apply(23, 24));
	}

}
