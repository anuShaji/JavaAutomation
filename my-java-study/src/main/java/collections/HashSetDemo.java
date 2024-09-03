package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
			//Declaration
				HashSet mySet=new HashSet();
		//Set mySet=new HashSet();
		//HashSet<String> mySet=new HashSet<String>();
		//adding data
		mySet.add("Ram");
		mySet.add("Sam");
		mySet.add("Lal");
		mySet.add(22);
		mySet.add(null);
		mySet.add("sunil");
		mySet.add("Bob");
		mySet.add(100);
		System.out.println(mySet);
		
		//Remove specific value from hash set
		mySet.remove("Ram");//passing directly the value instead if index
		System.out.println(mySet);
		
		//inserting element -->not possible
		
		//retrieving or accessing specific element-->not possible
		 //there is an alternative way 
		//convert the set into arraylist and then access
		
		ArrayList al = new ArrayList(mySet);//-->created array list object and passed it to arraylist(converted sset to list)
		System.out.println(al);
		System.out.println(al.get(3));
		
		//read elements using enhnaced for loop
		for(Object x:mySet) {
			System.out.println(x);
		}
		//using iterator
	Iterator it=mySet.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
	//Clearing all the elements in hash set
	mySet.clear();
	mySet.isEmpty();
	
	//Hashset size 
	mySet.size();
		
	}

}
