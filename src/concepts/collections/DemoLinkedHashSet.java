package concepts.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating HashSet and adding elements  
       LinkedHashSet<String> set=new LinkedHashSet();  
       set.add("One"); 
       set.add("Five"); 
       set.add("Two");    
       set.add("Three");   
       set.add("Four");  
        
       Iterator<String> i=set.iterator();  
       while(i.hasNext())  
       {  
    	   System.out.println(i.next());  
       }  

	}

}
