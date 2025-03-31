package practises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PracSplitStringIntoList {

	public static void main(String[] args) {
		String s = "Spliterator";

		List<Character> li = Arrays.stream(s.split("")).map(c -> c.charAt(0)).collect(Collectors.toList());

		System.out.println(li);

		li.addFirst('y');

		int index = li.indexOf('y');

		li.remove(index);

		System.out.println(li);

	}

}
