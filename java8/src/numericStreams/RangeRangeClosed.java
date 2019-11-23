package numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RangeRangeClosed {

	public static void main(String[] args) {
		//minimum using reduce
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int smallest1 = nums.stream().min((i1,i2) -> i1.compareTo(i2)).orElse(0);
		System.out.println(smallest1);
		
		//intStreams are based on primtives and no need of unboxing
		System.out.println(IntStream.of(1,2,3,4,5,6,7,8,9)
			.min().orElse(0));
		;
		
		//ranges
		System.out.println(
				IntStream.range(1, 10).max().orElse(0)
				);
		
		System.out.println(
				IntStream.rangeClosed(1, 10).max().orElse(0)
				);
	}

}
