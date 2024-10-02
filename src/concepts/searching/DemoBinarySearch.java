package concepts.searching;

import java.util.Arrays;

public class DemoBinarySearch {

	static void binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;
		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("element found " + arr[mid]);
				return;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
	}

//	
	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 7, 8 };
		Arrays.sort(arr);

		System.out.println("Runnin binary search");
//		
		binarySearch(arr, 0, arr.length, 5);

	}
}
