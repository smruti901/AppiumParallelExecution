package AppiumPractice3;

import java.util.Iterator;
import java.util.Scanner;

public class ReverseAndPalindrome {

	public static void main(String[] args) {
		String s="Java is Easy";
		String reverse="";
		String reverse2="";
		String result="";
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter string");
		//s=sc.nextLine();
		int count=0;
		for (int i = s.length()-1; i>=0; i--) {
			reverse= reverse+ s.charAt(i);
			count++;
		}
		System.out.println(reverse);
		System.out.println(count);
		
		if(reverse.equals(s))
		{
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		for (int i = 0; i < s.length(); i++) {
			if(result.indexOf(s.charAt(i))==-1)
			{
				result=result+s.charAt(i);
				
			}
			
		}
		System.out.println(result);
		
		String arr[]=s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length()-1; j>=0; j--) {
				reverse2=reverse2+arr[i].charAt(j);
			}
			reverse2=reverse2+" ";
			
		}
		System.out.println(reverse2);
		System.out.println(s.substring(1));
		
		int var=123456;
		String str12 = String.format("%050d", var);
		System.out.println(str12);
		}
}
