package java8.stream.factoryMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BoxUnboxExample {
	public static void main(String[] args) {

		//unboxing
		List<Integer> wrapperList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		long count = wrapperList.stream().mapToInt(Integer :: intValue).count();
		System.out.println(count);
		//boxing
		IntStream.rangeClosed(1, 9).boxed().filter(i -> i%2==0).forEach(System.out::println);
	}

}
