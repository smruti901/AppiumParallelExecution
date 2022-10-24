package JAVAprograms;

import java.util.Collections;
import java.util.Enumeration;

public class Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Vector<Object> vec= new java.util.Vector<Object>();
		vec.add("One");
		vec.add("Two");
		vec.add("Three");
		System.out.println("Size of Vector---->"+vec.size());
		System.out.println("Capacity of Vector---->"+vec.capacity());
		System.out.println(vec);
		vec.addElement("Four");
		vec.addElement("Five");
		vec.addElement("Six");
		System.out.println("Size of Vector---->"+vec.size());
		System.out.println("Capacity of Vector---->"+vec.capacity());
		System.out.println(vec);
		if(vec.contains("Three")) {
			System.out.println("Yes Present and Index is ---->"+vec.indexOf("Three"));
			
		}
		else
		{
			System.out.println("Not Present");
		}
		
		vec.addElement("Seven");
		vec.addElement("Eight");
		vec.addElement("Nine");
		System.out.println("Size of Vector---->"+vec.size());
		vec.addElement("Ten");
		vec.addElement("Eleven");
		vec.addElement("Twelve");
		System.out.println(vec);
		System.out.println("Size of Vector---->"+vec.size());
		System.out.println("Capacity of Vector---->"+vec.capacity());
		
		System.out.println(vec.firstElement());
		System.out.println(vec.lastElement());
		
		Enumeration<Object> newvec = vec.elements();
		while(newvec.hasMoreElements()) {
			System.out.println(newvec.nextElement());
		}
		

	}

}
