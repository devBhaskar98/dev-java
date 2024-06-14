package Problems;

import java.util.Scanner;

public class ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string");
		String str = sc.nextLine();

//		StringBuilder reverseString = new StringBuilder(str);
//		System.out.println(reverseString.reverse());

		// Traditional Way
		char[] ch = str.toCharArray();
		String reverse;

		for(char c : ch) {
			System.out.println(c);

		}


	}

}
