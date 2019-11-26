package asyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Basic1 {
public static void main(String[] args) {
	CompletableFuture<String> ci = new CompletableFuture<String>();
	ci.complete("random val");
	try {
		System.out.println(ci.get());
	} catch (InterruptedException | ExecutionException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("jai shree ram");
}
}
