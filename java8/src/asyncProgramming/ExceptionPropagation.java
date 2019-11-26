package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionPropagation {
	 public static void main(String[] args) {
		 CompletableFuture<Void> total = CompletableFuture.supplyAsync(() -> "first process")
				.thenApply(in -> {
					System.out.println("first task started");
					return " second process after "+in;
					})
				.thenApply(in -> {
					System.out.println("second task started");
					boolean need = true;
					if(need) {
						throw new RuntimeException("jai shree ram");
					}
					return " third process after "+in;
							})
				.thenApply(in ->{ 
					System.out.println("third task started");
					return " fourth process after "+in;
					})
				.thenAccept(in -> System.out.println(in))
			
		;
		 try {
			System.out.println("complete "+total.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
System.out.println(e.getMessage());		}
		
	}
}
