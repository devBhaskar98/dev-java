package demos;

@FunctionalInterface
interface Concatenator {
	String concat(String s1, String s2);
}

public class DemoFunctionalInterface {

	static String execute(Concatenator concatenator, String a, String b) {
		return concatenator.concat(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lets define implementation for function
		Concatenator concatenate = (String s1, String s2) -> s1 + s2;

		System.out.println(execute(concatenate, "blue", "star"));

	}

}
