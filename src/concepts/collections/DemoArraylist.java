package concepts.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// populate the arrayList from other ArrayList
		DataPerson dp = new DataPerson();
		List<DataPerson> demo1 = dp.getPersonList();
		for(DataPerson person: demo1) {
			System.out.println(person.toString());
		}
		
		// enter at 0 position and shifting to right
		demo1.add(0, new DataPerson(4, "doug", "doug@devproject.com"));
		
		
		
		//Getting Iterator  
		Iterator<DataPerson> itr=demo1.iterator();  
		 //traversing elements of ArrayList object  
		 while(itr.hasNext()){  
		   DataPerson dpIterator= itr.next();  
		   System.out.println(dpIterator.getId() );  
		 }
		 
		 
		// Descending Iterator
		 ListIterator<DataPerson> iterator = demo1.listIterator(demo1.size());

	        // Iterate in descending order
	        System.out.println("Iterating in descending order:");
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
		
	}

}
