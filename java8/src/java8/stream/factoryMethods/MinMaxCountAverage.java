package java8.stream.factoryMethods;

import java.util.stream.IntStream;

public class MinMaxCountAverage {

	public static void main(String[] args) {
		int min = IntStream.rangeClosed(1, 10).min().orElseThrow(() -> new RuntimeException("empty int stream"));
		System.out.println(min);
		
		System.out.println(IntStream.rangeClosed(1, 10).average().orElse(0.0D));
		
		int min1 = IntStream.empty().min().orElseThrow(() -> new RuntimeException("empty int stream"));
	}

}
