package concepts.collections;

import java.util.ArrayDeque;

public class DemoQueueAqueue {

	public static void main(String[] args) {
		ArrayDeque<String> queue = new ArrayDeque<String>();

		queue.add("A");
		queue.add("B");

		queue.addLast("C");
		queue.addFirst("Z");

		System.out.println("my queue" + queue);

		if (queue.contains("C")) {
			System.out.println("Person C is waiting in queue");
		}

	}

}
