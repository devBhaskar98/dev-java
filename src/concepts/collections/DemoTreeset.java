package concepts.collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoTreeset {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>(Comparator.comparing(String::length));

		ts.add("Bhaskar");
		ts.add("test");
		ts.add("Dixit");

		Iterator<String> itr = ts.iterator();

		while (itr.hasNext()) {
			System.out.println("t->" + itr.next());
		}

	}

}
