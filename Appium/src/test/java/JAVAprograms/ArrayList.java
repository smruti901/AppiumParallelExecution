package JAVAprograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;



public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		java.util.ArrayList<Object> list= new java.util.ArrayList<Object>();
//		
//		//Add element to the Array
//		list.add(10);
//		list.add("A");
//		list.add("Hello");
//		list.add(20);
//		list.add(50);
//		System.out.println(list);
//		
//		//Add elements in Particular index place
//		list.add(2, "b");
//		System.out.println(list);
//		java.util.ArrayList<Object> list2= new java.util.ArrayList<Object>();
//		list2.add(30);
//		
//		
//		//Add elements to previous list
//		list.addAll(list2);
//		System.out.println(list);
//		
		//To check the condition
//		if (list.contains(30)) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
//		
		//To Print all the Elements
//		for(Object newlist:list) {
//			System.out.println(newlist);
//		}
//		
		//To Print all the Elements in Sorted Order
//		Collections.sort(list2);
//		for(Object newlist1:list2) {
//			System.out.println(newlist1);
//		}
//		
		// To retain all common values in to lists
//		list.retainAll(list2);
//		System.out.println(list);
		// It will remove all the datas
//		list.removeAll(list2);
//		System.out.println(list);
		
		//To print value 
		//System.out.println(list.get(2));
		
		//java.util.ArrayList l= new java.util.ArrayList();
//		java.util.ArrayList ll= new java.util.ArrayList<>();
////	    java.util.ArrayList l2= new java.util.ArrayList<>(null);
////	    
////	    LinkedList ll= new LinkedList();
//	    System.out.println(ll.size());
//	    ll.add(10);
//	    System.out.println(ll.size());
//	    
//	   
//	    
//	    LinkedList ll2= new LinkedList();
//	    
//	    ll2.add(20);
//	    
//	    
//	    ll.addAll(ll2);
//	    System.out.println(ll);
//	    
//	    HashSet h= new HashSet<>();
//	   
//	    HashSet h1= new HashSet<>(0);
//	    HashSet h2= new HashSet<>(0, 0);
//	    HashSet h3= new HashSet<>(null);

		TreeSet set= new TreeSet<>();
		boolean s1 = set.add(10);
		set.add(-11);
		set.add(30);
		set.add(-40);
		set.comparator();
		Comparable com=(Comparable)set;
		
		System.out.println(com.compareTo(com));
		System.out.println(set);
		
	    
	    
	    
		

	}

}
