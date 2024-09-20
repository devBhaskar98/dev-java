package Problems.Arrays;

import java.util.Arrays;

public class CPRotateArray {

	public static void rotate(int[] nums, int k) {
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		System.out.println(Arrays.toString(nums));
//	    reverse(nums, 0, k - 1);
//	    reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int l, int r) {
		while (l < r) {
			System.out.println("l" + l + " r" + r);
		}
		swap(nums, l++, r--);
	}

	private static void swap(int[] nums, int l, int r) {
		final int temp = nums[l];
		nums[l] = nums[r];
		nums[r] = temp;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		rotate(nums, 3);

	}

}
