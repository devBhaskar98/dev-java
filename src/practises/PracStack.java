package practises;

import java.util.Iterator;
import java.util.Stack;

public class PracStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack();

		st.push(1);
		st.push(2);
		st.push(3);

		Iterator<Integer> li = st.iterator();
		while (li.hasNext()) {
			System.out.println("li>>" + li.next());
		}

		for (Integer i : st) {
			System.out.println("for each>>" + i);
		}

		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}

	}

}