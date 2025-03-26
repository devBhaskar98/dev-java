package concepts.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoFuture {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Future<Integer> future = executor.submit(() -> {
			Thread.sleep(2000);
			return 42;
		});

		try {
			Integer result = future.get();
			System.out.println("Result " + result);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}

	}

}