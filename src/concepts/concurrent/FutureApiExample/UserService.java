package concepts.concurrent.FutureApiExample;

import java.util.concurrent.CompletableFuture;

public class UserService {
	// Simulates an async API that fetches user details
	public CompletableFuture<String> getUserDetails(int userId) {
		return CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000); // Simulating delay
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "User Data for ID: " + userId;
		});
	}
}
