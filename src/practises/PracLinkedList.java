package practises;

import java.util.Iterator;
import java.util.LinkedList;

public class PracLinkedList {

	public static void main(String[] args) {

		LinkedList<String> li = new LinkedList();

		li.add("b");
		li.add("d");

		// iterate over list
		Iterator<String> it = li.iterator();
		while (it.hasNext()) {
			System.out.println("val " + it.next());
		}

		// insert in head
		li.addFirst("a");

		int index = li.indexOf("b") + 1; // Find "b" and insert "c" after it
		li.add(index, "c");

		Iterator<String> it1 = li.iterator();
		while (it1.hasNext()) {
			System.out.println("val " + it1.next());
		}

		System.out.println("print using stream::");

		li.stream().forEach(str -> System.out.println("mystream " + str));

	}

}
