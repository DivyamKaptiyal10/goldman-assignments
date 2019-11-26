package asyncProgramming;

import java.util.concurrent.CompletableFuture;

public class ThenRunchaining {

	public static void main(String[] args) {
		CompletableFuture.supplyAsync(() ->  "hello")
		.thenAccept(System.out::println);
	}

}
