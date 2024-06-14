package dev;

import java.util.HashMap;
import java.util.Map;

class NoDuplicateHashMap<k,V> extends HashMap<k, V> {

	 @Override
    public V put(k key, V value) {
        if (containsKey(key)) {
            throw new IllegalArgumentException("Duplicate key " + key + " is not allowed.");
        }
        return super.put(key, value);
    }

}

public class DevHashMap {

	public static  <K,V> void putIfNotDuplicate(Map<K, V> map, K key, V value) {
        if (map.containsKey(key)) {
            throw new IllegalArgumentException("Duplicate key " + key + " is not allowed.");
        }
        map.put(key, value);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hm = new NoDuplicateHashMap<>();

		try {
			hm.put(1, "one");
//			hm.put(1, "two");
			putIfNotDuplicate(hm, 2, "two");
		} catch ( IllegalArgumentException ex) {
			System.out.println("Caugt" + ex);
		}

		for(Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}





	}

}
