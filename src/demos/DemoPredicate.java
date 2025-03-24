package demos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoPredicate {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6));

		Predicate<Integer> isOdd = num -> num % 2 != 0;

		List<Integer> oddNumbers = list.stream().filter(isOdd).collect(Collectors.toList());

		System.out.println(oddNumbers);

	}

}
