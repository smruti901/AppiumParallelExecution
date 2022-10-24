package JAVAprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.testng.annotations.Test;

public class StringPrograms {
	String str="manigandan";
	@Test
	public void reverseString() {
		
		String reverse="";
		for (int i = 0; i <str.length(); i++) {
			
			reverse=str.charAt(i)+reverse;
		}
		System.out.println(reverse);
	}
	
	@Test
	public void countVowels() {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
			
		}
		System.out.println(count);
	}
	
	@Test
	public void countConsonants() {
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				System.out.println();
			}
			else if(str.length()!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void combineSimilarCharacters() {
		
		LinkedHashSet<Character> ch=new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			ch.add(str.charAt(i));
		}
		for(Character c:ch) {
			for (int i = 0; i < str.length(); i++) {
				if(c.equals(str.charAt(i))) {
					System.out.print(c);
				}
			}
			System.out.print(",");
		}
		
	}

	@Test
	public void SegregateAlphabetNumberSpecial() {
		String str1="4#$SDFyuiwh890";
		String AlphaUpper="";
		String AlphaLower="";
		String Number="";
		String Symbol="";
		
		for (int i = 0; i < str1.length(); i++) {
			char ch=str1.charAt(i);
			if(ch>='A' && ch<='Z' ) {
				AlphaUpper=AlphaUpper+ch;
						
			}
			else if (ch>='a' && ch<='z') {
				AlphaLower=AlphaLower+ch;
			}
			else if(ch>='0' && ch<='9') {
				Number=Number+ch;
			
			}
			else {
				Symbol=Symbol+ch;
				
			}
			
		}
		System.out.println(AlphaUpper);
		System.out.println(AlphaLower);
		System.out.println(Number);
		System.out.println(Symbol);
	}
	
	@Test
	public void OccurrenceOfCharacter() {
		String str1="manigandan";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for (int i = 0; i < str1.length(); i++) {
			
			set.add(str1.charAt(i));
			
		}
		for(Character ch:set) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==ch) {
					count++;
				}
			}
			System.out.println(ch+" "+count);
		}
		//System.out.println(set);//Remove duplicate characters
	}
	
	@Test
	public void CountVowelRemoveDuplicate() {
		String s="india";
		HashSet<Character> set= new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		int count=0;
		for(Character ch:set) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
			
		}
		System.out.println(set+" "+count);
//		char[] str1 = s.toCharArray();
//		for (int i = 0; i < str1.length; i++) {
//			if(str1[i]=='a' || str1[i]=='e' || str1[i]=='i' || str1[i]=='o' || str1[i]=='u') {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
	
	@Test
	public void OccurrenceOfWords() {
		String s="welcome to bangalore and welcome to Test Yantra";
		String[] sp = s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) {
		set.add(sp[i]);
		}
		for(String word:set) {
			int count=0;
			for (int i = 0; i < sp.length; i++) {
			if(word.equals(sp[i])) {
				count++;
			}
			}
			System.out.println(word+" "+count);
		}
		System.out.println(set);
	}
	
	@Test
	public void PrintDuplicateCharacter() {
		LinkedHashSet<Character> set= new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for(Character ch:set) {
			int count=0;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)==ch){
					count++;
				}
			}
			if(count>3) {
				System.out.println(ch+" "+count);
			}
		}
	}
	@Test
	public void PrintDuplicateWords() {
		String s="welcome to bangalore and welcome to Test Yantra";
		String[] sp = s.split(" ");
		LinkedHashSet<String> set= new LinkedHashSet<String>();
		for (int i = 0; i < sp.length; i++) {
		set.add(sp[i]);
		}
		for(String word:set) {
			int count=0;
			for (int i = 0; i < sp.length; i++) {
			if(word.equals(sp[i])) {
				count++;
			}
			}
			if(count>1) {
			System.out.println(word+" "+count);
			}
			
		}
		System.out.println(set);//Remove duplicate words
	}
	
	@Test
	public void ReverseSentence() {
		String s="welcome to bangalore and welcome to Test Yantra";
		for (int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
	}
	
	@Test
	public void ArrangeAlphabeticalOrder() {
		String s="welcome to bangalore and welcome to test yantra ";
		String[] sp = s.split(" ");
		TreeSet<String> set= new TreeSet<String>();
		for (int i = 0; i < sp.length; i++) {
			set.add(sp[i]);
		}
		System.out.println(set);
		
			
	}
	
	@Test
	public void ShiftWord() {
		String s="welcome to bangalore and welcome to Test Yantra";
		String[] sp = s.split(" ");
		int key=7;
		for (int i = 0; i < key; i++) {
			String temp=sp[0];
			for (int j = 1; j < sp.length; j++) {
				sp[j-1]=sp[j];
			}
			sp[sp.length-1]=temp;
		}
		for(String str2:sp) {
			System.out.print(str2+" ");
		}
		System.out.println();
	}
	
	@Test
	public void findMinimumTime() {
		String a="movie1 2:16 90";
		String b="movie1 2:16 110";
		String c="movie1 2:16 70";
		
		int i=Integer.parseInt(a.split(" ")[2]);
		int i1=Integer.parseInt(b.split(" ")[2]);
		int i2=Integer.parseInt(c.split(" ")[2]);
			
			int i3=Math.abs(i-i1);
			int i4=Math.abs(i-i2);
			int i5=Math.abs(i1-i2);
		if(i3<i4) {
			System.out.println(i3);
		}
		else if(i4<i5) {
			System.out.println(i4);
		}
		else {
			System.out.println(i5);
		}
			
		
	}
	
	@Test
	public void OccurrenceOfVowels() {
		
		 
        // allocate space for 5 vowels
        int[] counters = new int[5];

        for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'A') {
                        counters[0]++;
                } else if (ch == 'e' || ch == 'E') {
                        counters[1]++;
                } else if (ch == 'i' || ch == 'I') {
                        counters[2]++;
                } else if (ch == 'o' || ch == 'O') {
                        counters[3]++;
                } else if (ch == 'u' || ch == 'U') {
                        counters[4]++;
                }
        }

        // print the frequency of each vowel
        System.out.println("Count of 'a' = " + counters[0]);
        System.out.println("Count of 'e' = " + counters[1]);
        System.out.println("Count of 'i' = " + counters[2]);
        System.out.println("Count of 'o' = " + counters[3]);
        System.out.println("Count of 'u' = " + counters[4]);

	}
	
//	public void Test() {
//		char ch;
//		int count = 0;
//		for(ch='A'; ch<='Z';ch++)
//		{
//			System.out.print(" "+ch+" ");
//			
//			
//	}
//		for(int i=1;i<=10;)
//		{
//			System.out.print(i);
//			break;
//		}
//	}
	
	@Test
	public void printMultipleOf5AsHi() {
		String it = null;
		for (int i = 1; i <=10; i++) {
			
			for (int j = 1; j <=10; j++) {
				
				if(i==5*j) {
					it=Integer.toString(i);
					System.out.print(it.replace(it, "hi")+" ");
				}
				
			}
			System.out.print(i);
			
		}
	}
	
}
