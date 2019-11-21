package java8.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMethodReference {

	public static void main(String[] args) {
		Comparator<Integer> c = Integer :: compareTo;
		List<Integer> items = Arrays.asList(23,43,11,12,4,22);
		Collections.sort(items,c);
		
		items.stream().forEach(System.out::println);
	}
}
