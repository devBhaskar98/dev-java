package concepts.collections;

import java.util.HashSet;
import java.util.Iterator;

public class DemoHashset {

	public static void main(String[] args) {
		//Creating HashSet and adding elements
	   HashSet<String> set=new HashSet();
       set.add("One");
       set.add("Two");
       set.add("Three");
       set.add("Four");
       set.add("Five");
       set.add("Five");
       Iterator<String> i=set.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }

       DataPerson dp = new DataPerson();
       HashSet<DataPerson> dphs = new HashSet<>(dp.getPersonList());
       for(DataPerson person: dphs) {
    	   System.out.println(person);
       }


	 }
}
