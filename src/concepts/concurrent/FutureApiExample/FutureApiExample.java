package concepts.concurrent.FutureApiExample;

import java.util.concurrent.CompletableFuture;

public class FutureApiExample {

	public static void main(String[] args) {
		UserService userService = new UserService();

		System.out.println("Requesting user details...");

		// Call the async API
		CompletableFuture<String> futureResponse = userService.getUserDetails(101);

		// Attach a callback to handle the response when available
		futureResponse.thenAccept(response -> System.out.println("Response received: " + response));

		System.out.println("Doing other work while waiting...");

		// Wait for the future to complete before exiting (only for demo)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

	}

}
