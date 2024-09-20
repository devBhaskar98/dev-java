package Problems;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class CPReverseKElementsQueue {

	public static void reverseFirstK(Queue<Integer> q, Integer k) {
		Deque<Integer> d = new ArrayDeque<Integer>();

		// Dequeue the first k elements of the queue and
		// push them onto a deque
		for (int i = 0; i < k; i++) {
//			System.out.println(q.poll());
			d.push(q.poll());
		}

		System.out.println("q1" + q);

		// Pop the elements from the deque and enqueue them
		// back into the queue
		while (!d.isEmpty()) {
			q.add(d.pop());
		}

		System.out.println("my queue with breakdown without reverse " + q);
		// Dequeue the remaining elements from the queue and
		// enqueue them back into the queue
		for (int i = 0; i < q.size() - k; i++) {
			q.add(q.poll());
		}
	}

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);

		int k = 5;

		// function call.
		reverseFirstK(q, k);

		while (!q.isEmpty()) {
			System.out.print(q.peek() + " ");
			q.poll();
		}
	}
}
