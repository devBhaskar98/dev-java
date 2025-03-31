package practises;

import java.util.Scanner;

public class PracMultiDimensionalArr {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];

		Scanner sc = new Scanner(System.in);

		System.out.println("kindly enter the values");

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();

			}
		}

		// iterating the array

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(" " + arr[i][j]);

			}
			System.out.println();
		}

	}

}
