package practises;

public class PracReverseNumber {

	public static void main(String[] args) {
		int num = 1234;
		int reverseNum = 0, remainder = 0;
		while (num != 0) {
			remainder = num % 10;
			reverseNum = reverseNum * 10 + remainder;
			num = num / 10;
		}

		System.out.println("Reversed Number is " + reverseNum);

	}

}
