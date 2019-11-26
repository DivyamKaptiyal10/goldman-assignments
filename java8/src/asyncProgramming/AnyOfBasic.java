package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AnyOfBasic {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	CompletableFuture<String> c1 = CompletableFuture.supplyAsync(() -> {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "task1 future";
	});
	
	CompletableFuture<String> c2 = CompletableFuture.supplyAsync(() -> {
		try {
			Thread.sleep(1100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "task2 future";
	});
	
	CompletableFuture<String> c3 = CompletableFuture.supplyAsync(() -> {
		try {
			Thread.sleep(1600);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "task3 future";
	});
	
	CompletableFuture<String> c4 = CompletableFuture.supplyAsync(() -> {
		try {
			Thread.sleep(1900);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "task4 future";
	});

	CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(c1,c2,c3,c4);
	
	System.out.println(anyOfFuture.get());
}

}
