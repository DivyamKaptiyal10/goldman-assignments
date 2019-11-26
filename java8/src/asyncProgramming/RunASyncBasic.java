package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunASyncBasic {
	public static void main(String[] args) {
		
		CompletableFuture<Void> nall = CompletableFuture.runAsync(() -> {
			System.out.println("task started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("task completed");
		});
		
		try {
			nall.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
