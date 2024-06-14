package Problems;

import java.util.HashSet;
import java.util.Set;

public class DemoDoubleBraceIntialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an empty HashSet using double brace initialization
		Set<String> st = new HashSet<>() {
			{
				// Adding elements to the HashSet using double brace initialization
				add("cat");
				add("dog");
				add("lion");
			}
		};


		System.out.println("SET IS " + st);
	}

}
