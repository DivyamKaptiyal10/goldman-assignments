package java8.stream.factoryMethods;

import java.util.Random;
import java.util.stream.Stream;

public class StreamOfIterateGenerateExample {

	public static void main(String[] args) {
		Stream<Integer> nums = Stream.of(1,2,3,4,5,6,7,8,9);
		
		nums.filter(i -> i%2 == 0).skip(2).forEach(System.out::println);
		
		System.out.println(Stream.iterate(1, x -> x+1).limit(100).mapToInt(a -> a).sum());
		
		
		Stream.generate(new Random()::nextInt)
		.limit(10).forEach(System.out::println);
	}

}
