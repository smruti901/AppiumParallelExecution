package JAVAprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class JavaPractice {

	int a[]= {20,30,10,50,40};
	int a1[]= {2,3,4,5,6,7,8,9,10};
	@Test
	public void reverse() {
		String s="india is good";
		s.length();
		String reverse="";
		for (int i=s.length()-1;i>=0; i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}


	//get all the elements of given array in sorted order
	@Test
	public void sortArray() {
		//10 30 20 50 40
		//10 20 30 50 40
		//10 20 30 40 50
		for (int i = 0; i < a.length; i++) {
			//i=0 0<5 i=1 1<5 2<5 3<5 4<5 5<5
			for (int j = i+1; j < a.length; j++) {
				//j=1 1<5 2<5 3<5 4<5 5<5
				//j=2 2<5 3<5 4<5 5<5
				//j=3 3<5 4<5 5<5
				//j=4 4<5 5<5
				//j=5 5<5

				if(a[i]>a[j]) {// 20>30 20>10 20>50 20>40 , 30>10 30>50 30>40 , 30>50 30>40, 50>40

					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

	//get all the elements of given array in descending order
	@Test
	public void descendArray() {
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
	//find first maximum element
	@Test
	public void FirstMaxArray() {
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
		System.out.println(a[0]);
	}
	//find second maximum element
	@Test
	public void SecondMaxArray() {
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
		System.out.println(a[1]);
	}

	//find first and second minimum 
	@Test
	public void FirstAndSecondMinArray() {
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
	//sum of first three minimum elements
	@Test
	public void SumOfFirstThreeMinimumArray() {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];

		}
		System.out.println(sum);

	}
	//sum of first three maximum elements
	@Test
	public void SumOfFirstThreeMaximumArray() {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			//System.out.println(a[i]);
		}
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];

		}
		System.out.println(sum);

	}
	//get the first maximum number in given array without using bubblesort

	@Test
	public void FirstMaxWithOutBubbleSortArray() {
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	//get the second maximum number in given array without using bubblesort

	@Test
	public void SecondMaxWithOutBubbleSortArray() {
		int fmax=a[0];
		int smax=a[0];
		for (int i = 1; i < a.length; i++) {
			if(fmax<a[i]) {
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i])
			{
				smax=a[i];
			}
		}
		System.out.println(smax);
	}

	@Test
	public void printPrimeNumberArray() {
		for (int i = 0; i < a1.length; i++) {
			int n=a1[i];
			int j=2;
			while(true) {
				if(n%j==0) {
					break;
				}
				else {
					j++;
				}
			}
			if(j==n) {
				System.out.println(a1[i]);
			}
		}
	}

	@Test
	public void printLargestString() {
		String s[]= {"hi","hello","world","welcome","abcdefg"};
		int max=s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (max<s[i].length()) {
				max=s[i].length();
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==max) {
				System.out.println(s[i]);
			}
		}
	}

	@Test
	public void printSmallestString() {
		String s[]= {"hi","ab","hello","world","welcome","abcdefg"};
		int min=s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (min>s[i].length()) {
				min=s[i].length();
			}
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==min) {
				System.out.println(s[i]);
			}
		}
	}

	@Test
	public void printLargestAndSmallestString() {
		String s[]= {"hi","hello","world","welcome"};
		int max=s[0].length();
		int min=s[0].length();
		for (int i = 0; i < s.length; i++) {
			if (max<s[i].length()) {
				max=s[i].length();

			}
			if (min>s[i].length()) {
				min=s[i].length();
			}

		}
		for (int i = 0; i < s.length; i++) {
			if(s[i].length()==max || s[i].length()==min) {
				System.out.println(s[i]);
			}
		}
	}

	@Test
	public void shifting() {
		int a[]= {1,2,3,4,5};
		int key=3;
		for (int j = 0; j < key; j++) {
			int temp=a[0];
			for (int i = 1; i < a.length; i++) {
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

		//		for (int i = key; i < a.length; i++) {
		//		System.out.print(a[i]+" ");
		//		}
		//		for (int i = 0; i < key; i++) {
		//		System.out.print(a[i]+" ");
		//		}
	}

	@Test
	public void missingNumbers() {
		int a[]= {-4,-1,1,2,4,5,7,10};
		for (int i = 0; i < a.length-1; i++) {
			int n=a[i+1]-a[i];
			int count=1;
			while(n>1) {
				System.out.println(a[i]+count);
				count++;
				n--;
			}
		}
	}

	@Test
	public void AppendZeroFirst() {
		int a[]= {3,0,0,5,1,0,2,0,9,0,0,7,0};
		//		for (int i = 0; i < a.length; i++) {
		//			if(a[i]==0) {
		//				System.out.print(a[i]);
		//			}
		//		}
		//			for (int j = 0; j < a.length; j++) {
		//				if(a[j]!=0) {
		//					System.out.print(a[j]);
		//					
		//				}
		//			}
		//			System.out.println();

		int b[]= new int[a.length];
		//		int n=0;
		//		for (int i = 0; i < a.length; i++) {
		//			if(a[i]==0) {
		//				b[n++]=a[i];
		//			}
		//		}
		//		for (int i = 0; i < a.length; i++) {
		//			if(a[i]!=0) {
		//				b[n++]=a[i];
		//			}
		//		}
		//		for (int i = 0; i < b.length; i++) {
		//			System.out.print(b[i]);
		//		}
		//		System.out.println();

		int count=0;
		int j=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				count++;

			}

		}
		System.out.println(count);


		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				b[j++]=a[i];

			}
			else
			{
				b[count++]=a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
		System.out.println();
	}

	@Test
	public void FiboArray() {
		int a[]= {4,7};
		int prev=a[0];
		int next=a[1];
		System.out.println(prev);
		System.out.println(next);
		for (int i = 0; i < 8; i++) 
		{			
			int sum=prev+next;
			prev=next;
			next=sum;

			System.out.println(sum+" ");
		}
	}

	@Test
	public void sumOfDigitOfArray() {
		int number=123, digit, sum = 0;  

		while(number > 0)  
		{  
			//finds the last digit of the given number    
			digit = number % 10;  
			//adds last digit to the variable sum  
			sum = sum + digit;  
			//removes the last digit from the number  
			number = number / 10;  
		}  
		//prints the result  
		System.out.println("Sum of Digits: "+sum);  

	}

	@Test
	public void AdditionOfArrays() {
		int a[]= {2,1,3};
		int b[]= {1,3,2,4};
		int length=a.length;
		if(a.length<b.length) {
			length=b.length;
		}
		for (int i = 0; i <length; i++) {
			//i=0 0<lt
			//i=1 1<lt
			//i=2 2<lt
			//i=3 3<lt
			//i=4 4<lt terminate

			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				// TODO: handle exception
				if(a.length<b.length) {
					System.out.println(b[i]);
				}
				else
				{
					System.out.println(a[i]);
				}
			}
		}
	}

	@Test
	public void reverseString() {
		String s="madam";
		//using third variable
				String reverse="";
				for (int i=s.length()-1;i>=0; i--) {
					reverse=reverse+s.charAt(i);
				}
				System.out.println(reverse);
				if(reverse.equals(s)) {
					System.out.println("Palindrome");
				}
				else {
					System.out.println("Not Palindrome");
				}

		//using charAt
		//		for (int i=s.length()-1;i>=0; i--) {
		//			System.out.print(s.charAt(i));
		//		}

		//Using toCharArray
//		char[] str = s.toCharArray();
//		for (int i=str.length-1;i>=0; i--) {
//			System.out.print(str[i]);
//		}

	}

	@Test
	public void printAlphabets() {


		for(char c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.print(c + " ");
		}
	}

	@Test
	public void removeDuplicates() {
		String str="tester";
		String s = str.toUpperCase();
		LinkedHashSet<Character> set= new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			//i=0 0<6t
			//i=1 1<6t
			//i=2 2<6t
			set.add(s.charAt(i));
			System.out.println(set);
		}

		//[t e]
	}

	@Test
	public void nestedIf() {
		int a=19;
		int b=15;
		int c=25;
		if(a>b) {
			if(a>c) {
				System.out.println("a is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		else if(b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

	@Test
	public void fiboseries() {
		int prev=0;
		int next=1;
		int range=5;
		System.out.println(prev);
		System.out.println(next);
		for (int i = 1; i <= range; i++) {
			int sum=prev+next;
			System.out.println(sum);
			prev=next;
			next=sum;

		}
	}
	@Test
	public void Triangle() throws Exception {
		
			int a=1,b=2,c=3;
			if(a==b && b==c && c==a) {
				System.out.println("Equilateral");
			}
			else if(a==b || b==c || a==c) {
				System.out.println("Isosceles");
			}
			else {
				System.out.println("Scalane");
			}
		
	}
	
	@Test
	public void ArrayDiffrent() {
		
	      int [] myArray = {1,2,3,4,5,6,7,8};
	    
	     
	      System.out.println(Arrays.toString(myArray));
	      int[] myArray1 = Arrays.copyOfRange(myArray, 0, myArray[2]);
	      int[] myArray2 = Arrays.copyOfRange(myArray, myArray[2], myArray[5]);
	      int[] myArray3 = Arrays.copyOfRange(myArray, myArray[5], myArray[7]);
	      System.out.println("First half of the array:: "+Arrays.toString(myArray1));
	      System.out.println("First second of the array:: "+Arrays.toString(myArray2));
	      System.out.println("First third of the array:: "+Arrays.toString(myArray3));
	}
	
	@Test
	public void ArrayDiffrent1() {
		
	      int [] myArray = {1,2,3,4,5,6,7,8};
	    
	    ArrayList<Integer> arr= new ArrayList<>();
	     
	     for (int i = 0; i < myArray[2]; i++) {
	    	 arr.add(myArray[i]);
			
		}
	     for (int i = 0; i < myArray.length; i++) {
			
		}
	}
	
	@Test
	public void StringDelete() {
		String s="suummmtti";
		int key=3;int count=0;
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if(s1[i]=='m') {
				
			}
			else {
				System.out.print(s1[i]);
				
			}
			
		}
		System.out.println();
	}
	
	@Test
	public void StringReplace() {
		String s="suummmtti";
		int n=3;
		int l=s.length()-1;
		String fronts="",ends="";
		
	}
	
	@Test
	public void StarProgram() {
		int i, j, row = 6;    
		for (i=0; i<row; i++)   
		{  
		//inner loop work for space      
		for (j=2*(row-i); j>=0; j--)         
		{  
		//prints space between two stars      
		System.out.print(" ");   
		}   
		//inner loop for columns  
		for (j=0; j<=i; j++ )   
		{   
		//prints star      
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		 
	}
	
	@Test
	public void anagram() {
		String str1="race";
		String str2="care";
	    

	     if(str1.length() == str2.length()) {
      
	      char[] charArray1 = str1.toCharArray();
	      char[] charArray2 = str2.toCharArray();
  
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);
      
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str1 + " and " + str2 + " are anagram.");
	      }
	      else {
	        System.out.println(str1 + " and " + str2 + " are not anagram.");
	      }
	    }
	    

	    
	}
	
	@Test
	public void Panagram() {
		 String str = "a quick brown fox jumps over the lazy dog";
		
		 
	        boolean flag = false;
	 
	        
	        for (char ch = 'a'; ch <= 'z'; ch++) {
	            
	            if (str.contains(String.valueOf(ch))) {
	                flag = true;
	                break;
	            }
	        }
	 
	        if (flag)
	            System.out.println("Panagram");
	        else
	            System.out.println("Not Panagram");
		
	}
	
	@Test
	public void occurrenceUsingHashMap() {
		String s="mohapatra";
		char arr[]=s.toCharArray();
		Map<Character,Integer> m= new HashMap<Character,Integer>();
		for (int i = 0; i < arr.length; i++) {
			if(m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i])+1);
			}
			else {
				m.put(arr[i], 1);
			}
			
		}
		System.out.println(m);
		HashSet<Character>set=new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
 }
	
	@Test
	public void convertStringToInteger() {
		String s="123";
		int i = Integer.parseInt(s);
		System.out.println(i);
		Integer i1 = Integer.valueOf(s);
		System.out.println(i1);
	}
	
	@Test
	public void removeDuplicateUsingHashMap() {
		 int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };
	       
	        int n = arr.length;
	        HashMap<Integer, Boolean> mp = new HashMap<>();
	   	 
	        for (int i = 0; i < n; ++i) {
	             if (mp.get(arr[i]) == null)
	            {
	                System.out.print(arr[i] + " ");
	                mp.put(arr[i], true);
	            }
	        }
	}
	
	@Test
	public void reverseNumber() {
		int reverse,sum=0,temp;    
		  int number=12345;
		  
		      
		  while(number>0){    
		   reverse=number%10;   
		   sum=(sum*10)+reverse;    
		   number=number/10;    
		  }    
		  if(number==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");
	}
	
	@Test
	public void charaterprint() {
//		for (char c = 'z'; c >='a' ; c--) {
//			System.out.print(c);
//		}
		String s="Smruti";
		s.length();
		char[] c1 = s.toCharArray();
		for(Character c2:c1) {
			System.out.println(c2);
		}
		
		
	}
	
}
