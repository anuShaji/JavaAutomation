//package collections;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class ArrayListDemo {
//
//	public static void main(String[] args) {
//		ArrayList myList=new ArrayList();//One way to declare array list,there is no specific size
//		//List mList=new ArrayList();//This is also correct
//		//ArrayList<String> mList1=new ArrayList<String>();//allows to store only String kind of data
//		
//		
//		//Adding Data into array List
//		myList.add(100);
//		myList.add("Anupama");
//		myList.add(true);
//		myList .add(null);
//		myList.add("Anupama");
//		myList.add(100);
//		myList .add(null);
//		
////		
////		//To find size of array List
////		System.out.println(myList.size());//7
////		
////		//printing array list
////		System.out.println(myList);//[100, Anupama, true, null, Anupama, 100, null]
////		
////		//Remove objects/element  from arrayList
////		myList.remove(5);//5 is the index based on index we can remove
////		System.out.println("After removing " +myList);//After removing [100, Anupama, true, null, Anupama, null]
////		
////		//To insert an element in middlie of somewhere in arrayList
////		myList.add(2,"Insertion example");
////		System.out.println("After insertion : "+myList);//After insertion : [100, Anupama, Insertion example, true, null, Anupama, null]
////		
////		//Modify an arrayList/replace
////		myList.set(2, "january");
////		System.out.println("After replacing"+myList);//After replacing[100, Anupama, january, true, null, Anupama, null]
////
////		//Accessing Specific element from ArrayList
////		System.out.println(myList.get(5));//Anupama
////		
////		//reading all elements from array list
////		//Using Normal for loop
////		/*for(int i=0;i<myList.size();i++) {
////			System.out.println(myList.get(i));
////		}
////		//For each loop 
////		for(Object x:myList) {
////			System.out.println(x);
////			
////		}*/
////		
////		
////		//Iterator
////		Iterator it=myList.iterator();//calls iterator method from array list that return iterator object
////		while(it.hasNext()) {//-->checks whether next element is present or not,we do not know how much elements are present in array list so we use while loop
////			System.out.println(it.next());//if present retrieves next element
////			
////			//checking the list is empty or not
////			myList.isEmpty();
//			
//			//Remove all the elements from array list-->it cannot remove all elements
//		//myList.clear();-->To remove all
//		ArrayList myList2=new ArrayList();
//		myList2.add(100);
//		myList2.add("Anupama");
//		myList.removeAll(myList2);
//		System.out.println(myList);
//		
//		
//		}
//	
//	}
//
////}
