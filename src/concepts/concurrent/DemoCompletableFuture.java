package concepts.concurrent;

import java.util.concurrent.CompletableFuture;

public class DemoCompletableFuture {
	public static void main(String args[]) {
		CompletableFuture.supplyAsync(() -> {
			try {
				System.out.println("Working..");
				Thread.sleep(2000);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			return "Hello, Future";
		}).thenAccept(result -> System.out.println("Result " + result));

		System.out.println("Doing other work...");

		// Sleep to prevent main thread from exiting early
		try {
			Thread.sleep(3000);
			System.out.println("Main thread");
		} catch (Exception e) {
		}

		System.out.println("Doing other work... 2");
	}

}
