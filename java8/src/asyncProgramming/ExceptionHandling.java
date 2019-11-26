package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionHandling {

	public static void main(String[] args) {

		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
			System.out.println("first step");
			return "step 1";
		}).thenApply((str) -> {
			System.out.println("second step");
			return "second step after "+str;
			})
		.thenApply((str) -> {
			System.out.println("third step");
			boolean ka = true;
			if(ka) {
				throw new RuntimeException("fake wala");
			}
			return "third step after "+str;
			}).exceptionally(error -> {
				
				System.out.println("Exception wala "+error);
				return "Exception result";
			})
		.thenApply(str -> {
			System.out.println("fourth step");
			return "fourth step after "+str;
		})
		
		.thenApply(str ->{
			System.out.println("fifth step");
			return "fifth step after "+str;
			})
		;
		
		try {
			System.out.println(future.get());
		} catch (InterruptedException | ExecutionException e) {
			System.out.println("final error fetch akrte samay "+e);
		}
	}

}
