package concepts.functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class DemoPredicate {

	public void streamAndPrintArr() {
		List<Integer> list = new ArrayList<>(
	            Arrays.asList(1, 3, 4, 5, 2)
	        );
		list.stream().forEach(number -> System.out.println("streamAndPrintArr::" + number));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoPredicate dp = new DemoPredicate();
		dp.streamAndPrintArr();

		// Bi-Function
		// to call use apply()
		BiFunction<String, String, String> stringConcatenator = (s1, s2) -> s1 + s2;
		String result = stringConcatenator.apply("Hello", "World");
		System.out.println(result); // Output: HelloWorld

	}

}
