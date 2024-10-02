package Problems;

import java.util.HashMap;

public class CPArithmeticProgression {
	static boolean checkIsAP(int arr[], int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int smallest = Integer.MAX_VALUE, second_smallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {

			// Find the smallest and
			// update second smallest
			if (arr[i] < smallest) {
				second_smallest = smallest;
				smallest = arr[i];
			}

			// Find second smallest
			else if (arr[i] != smallest && arr[i] < second_smallest) {
				second_smallest = arr[i];
			}

			// Check if the duplicate element found or not
			if (!hm.containsKey(arr[i])) {
				hm.put(arr[i], 1);
			} else {
				return false;
			}
		}

		hm.entrySet().stream()
				.forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));

		// Find the difference between smallest and second
		// smallest
		int diff = second_smallest - smallest;

		// As we have used smallest and
		// second smallest,so we
		// should now only check for n-2 elements
		for (int i = 0; i < n - 1; i++) {
			System.out.println("diff" + diff + " second_Smallest" + second_smallest + " smallest" + smallest);
			if (!hm.containsKey(second_smallest)) {
				return false;
			}
			second_smallest += diff;
		}
		return true;
	}

	// Driven Program
	public static void main(String args[]) {
		int arr[] = { 20, 15, 5, 0, 10 };
		int n = arr.length;

		if (checkIsAP(arr, n)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		;

	}
}
