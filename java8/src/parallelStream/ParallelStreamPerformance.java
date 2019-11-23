package parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamPerformance {
	static long calculatePerformance(int n , Supplier<Integer> supplier) {
		System.out.println("processor count "+Runtime.getRuntime().availableProcessors());
		long start= System.currentTimeMillis();
		for(int a=0; a<n ; a++) {
			supplier.get();
		}
		long end = System.currentTimeMillis();
		return end-start;
		
	}

	static int sumSequential() {
		
		return IntStream.rangeClosed(1, 100000).sum();
	}
	
static int sumParallel() {
		
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}


	public static void main(String[] args) {
		System.out.println("sequential result "+calculatePerformance(20, ParallelStreamPerformance::sumSequential));
		System.out.println("parallel result "+calculatePerformance(20, ParallelStreamPerformance::sumParallel));
	}

}
