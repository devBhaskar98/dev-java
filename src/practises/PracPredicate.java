package practises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Predicate;

public class PracPredicate {

	public static void main(String args[]) {

		Predicate<Integer> isEven = (x) -> x % 2 == 0;

		LinkedList<Integer> li = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

		li.stream().filter(isEven).forEach(System.out::println);

	}

}
