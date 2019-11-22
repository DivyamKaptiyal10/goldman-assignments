package java8.stream;

import java.util.Arrays;

public class MaxUsingReduce {

	public static void main(String[] args) {
		System.out.println(Arrays.asList(2,4,5,3,6,7,8,8,6).stream().
					reduce(Integer :: min).orElse(0)
				);
	}

}
