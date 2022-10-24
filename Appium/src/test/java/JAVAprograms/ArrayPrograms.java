package JAVAprograms;

import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ArrayPrograms {

	String [] s={"abc","bcd","cde","def"};
	int[] a={7,6,11,5,7,11,6};

	/*
	 * Arranging array in ascending order
	 */
	@Test
	public void ascendingarray() {
		// TODO Auto-generated method stub

		 TreeSet<Integer> set= new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
			for (int j = 0; j < a.length; j++) {
				set.add(a[i]);
			}
			
		}
		System.out.println(set);
	}
	/*
	 * Arranging array in descending order
	 */
	@Test
	public void descendingarray() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			System.out.println(a[i]);
				
		}
	
	}
	/*
	 * Printing maximum number
	 */
	@Test
	public void FirstMaxAndSecondMax() {
		int fmax=a[0];
		for (int j = 0; j < a.length; j++) {
			if(a[j]>fmax) {
				fmax=a[j];
				
			}
		}
		
		int Smax =a[0];
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]>=fmax)
		{
		if(a[i]!=fmax)
		{
		Smax=fmax;
		}
		fmax=a[i];
		}
		else if(Smax==fmax || a[i]>Smax)
		{
		Smax=a[i];
		}
		}
		System.out.println(fmax+"\t"+ Smax);
		
	}
	/*
	 * Printing minimum number
	 */
	@Test
	public void minarray() {
		int fmin=a[0];
		for (int j = 0; j < a.length; j++) {
			if(a[j]<fmin) {
				fmin=a[j];
			}
		}
		
		int Smin =a[0];
		for (int i = 0; i < a.length; i++)
		{
		if(a[i]<=fmin)
		{
		if(a[i]!=fmin)
		{
		Smin=fmin;
		}
		fmin=a[i];
		}
		else if(Smin==fmin || a[i]<Smin)
		{
		Smin=a[i];
		}
		}
		System.out.println(fmin+"\t"+ Smin);
				
	}
	@Test
	public void occurrenceArray() {
		LinkedHashSet<Integer> a1= new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			a1.add(a[i]);
		}
		for(Integer it:a1) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]==it) {
					count++;
				}
			}
			System.out.println(it+":"+count);
		}
	}
	/*
	 * Append 0 or 1 to array
	 */
	@Test
	public void AppendFirstNumbers() {
		int[] a= {3,0,0,2,0,5};
		int[]b= new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n--;
			}
			else {
				b[m]=a[i];
				m++;
				
			}
			
		}
		for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
		}
	}
	
	/*
	 * Append 0 or 1 to array
	 */
	@Test
	public void AppendFirstZeros() {
		int[] a= {3,0,0,2,0,5};
		int[]b= new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				n--;
				
			}
			
		}
		for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
		}
	}
	
	@Test
	public void lowercase() {
		String s="SMRUTI";
		String s1 = s.toLowerCase();
		System.out.println(s1);
	}
	
	@Test
	public void removeSpace() {
		  String str="Hello world I am here";

		    for (char c : str.toCharArray()) {
		        if (c != ' ')
		            System.out.print(c);
		        
		    }
		    
		    String str1="Hello world I am here";
	        String r;

	         System.out.println();
	        r = str1.replaceAll(" ","");
	        System.out.println(r);  
	    
	}
	
	@Test
	public void ArrayPrint() {
		for (int i=1; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	

}
