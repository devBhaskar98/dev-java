package demos;

@FunctionalInterface
interface Concatenator {
	String concat(String s1, String s2);
}

@FunctionalInterface
interface Math {
	int add(int a, int b);
}

public class DemoFunctionalInterface {

	static String execute(Concatenator concatenator, String a, String b) {
		return concatenator.concat(a, b);
	}

	static int addittion(Math math, int a, int b) {
		return math.add(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lets define implementation for function
		Concatenator concatenate = (String s1, String s2) -> s1 + s2;

		// lets define implementation for function
		Math math = (int a, int b) -> a + b;

		System.out.println("concatenation result>" + execute(concatenate, "blue", "star"));
		System.out.println("addition result>" + addittion(math, 10, 10));

	}

}
