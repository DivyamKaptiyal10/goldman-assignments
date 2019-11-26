package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenCombine {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//unrelated tasks
		CompletableFuture<String> s1 = task1().thenCombine(task2(), (a,b) -> a+" "+b);
		System.out.println(s1.get());
	}
	
	static CompletableFuture<String> task1() {
		return CompletableFuture.supplyAsync(() -> "jai shree ram");
	}
	//no input as it is indepedent
	static CompletableFuture<String> task2() {
		return CompletableFuture.supplyAsync(() -> "jai shree ram");
	}

}
