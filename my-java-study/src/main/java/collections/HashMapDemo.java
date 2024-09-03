package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//Declaration
		//HashMap hm=new HashMap();
		//Map myMap=new HashMap();
		HashMap<Integer, String> hm=new HashMap<Integer, String>();

		//Adding pairs
		hm.put(101,"jhon");
		hm.put(102,"Ron");
		hm.put(102,"on");
		hm.put(104,"Bob");
		hm.put(105,"David");
		hm.put(105,"Scott");
		
		//size of hash map
		System.out.println(hm.size());
		
		//Remove one pair
		hm.remove(103);
		System.out.println(hm);
		
		//retrieve value of particular key
		
		System.out.println(hm.get(102));
		
		
		//get all the keys
		System.out.println(hm.keySet());
		
		//get all the values
		System.out.println(hm.values());
		
		//Retrieve key and values
		System.out.println(hm.entrySet());
		
		//Reading data from hash map
		
		for(int k:hm.keySet()) {
			System.out.println(k+" "+hm.get(k));
		}
		//iterator
		
		Iterator<Entry<Integer, String>> it =hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer, String> entry=it.next();
			System.out.println(entry.getKey()+ "  "+entry.getValue());
		}
		
		//clear all value
		hm.clear();
		
		//check empty or not
		hm.isEmpty();
	}

}
