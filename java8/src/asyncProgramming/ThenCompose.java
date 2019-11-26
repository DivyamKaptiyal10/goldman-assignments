package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCompose {



	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer> result1= task1().thenApply(ThenCompose :: task12);
		System.out.println(result1.get());
		
		CompletableFuture<CompletableFuture<Integer>> result12= task1().thenApply(ThenCompose :: task11);
		
		System.out.println(result12.get().get());
		CompletableFuture<Integer> result122= task1().thenCompose(ThenCompose :: task11);
		System.out.println(result122.get());
	}
	
	public static CompletableFuture<String> task1(){
		return CompletableFuture.supplyAsync(() -> "hello12");
	}
	
	public static CompletableFuture<Integer> task11(String str){
		return CompletableFuture.supplyAsync(() -> str.length());
	}
	
	public static Integer task12(String str){
		return str.length();
	}



}
