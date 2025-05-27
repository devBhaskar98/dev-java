package practises;

public class PracPallindrome {

	public static void main(String[] args) {
		String name = "123324";

		char[] ch = name.toCharArray();
		int n = ch.length - 1;

		for (int i = 0; i <= n / 2; i++) {
			if (ch[i] == ch[n - i]) {
				continue;
			} else {
				System.out.println("String is not pallindrome");
				break;
			}

		}
		System.out.println("String is pallindrome");

	}

}
