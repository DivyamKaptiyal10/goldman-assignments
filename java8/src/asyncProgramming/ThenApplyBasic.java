package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenApplyBasic {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> total = CompletableFuture.supplyAsync(() -> {
			System.out.println("t1 started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "kanishk";
		}).thenApplyAsync(input -> {
			System.out.println("t2 started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "hello "+input;
		})
		.thenApply(input1 ->  input1 + " yoyu aren the best");
		;
		
		System.out.println(total.get());
	}
	

}
