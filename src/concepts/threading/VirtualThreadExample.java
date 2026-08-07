package concepts.threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadExample {

    public static void main(String[] args) {

        try (ExecutorService executor =
                     Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 1; i <= 10_000; i++) {
                int taskId = i;

                executor.submit(() -> {
                    System.out.println(
                        "Task " + taskId +
                        " running on " + Thread.currentThread()
                    );
                });
            }
        }
    }
}
