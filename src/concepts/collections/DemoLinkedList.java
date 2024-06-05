package concepts.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		
		
		// populate the arrayList from other ArrayList
		DataPerson dp = new DataPerson();
		List<DataPerson> demo1 = dp.getPersonList();
		
		LinkedList<DataPerson> personll = new LinkedList<DataPerson>(demo1);
		
		for(DataPerson person: personll) {
			System.out.println(person.toString());
		}
		
		Iterator<DataPerson> ll = personll.iterator();
		
		while(ll.hasNext()) {
			System.out.println(ll.next());
		}
		
	}
}
