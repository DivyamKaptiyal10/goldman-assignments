package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SupplyAsyncBasic {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> t1 = CompletableFuture.supplyAsync(() -> {
			System.out.println("task started");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "jai shree ram";
		})
				
				;
		
		
		System.out.println(t1.get());
	}

}
