package AppiumPractice3;

import java.util.Arrays;
import java.util.Scanner;

public class Occurrence {
	public	static	void	main(String[]	args)		
	{	
		Scanner	sc=	new	Scanner	(System.in);	
		System.out.println	("enter	the	size");	
		int	length=	sc.nextInt	();	

		int	arr	[	]	=new	int	[length];	
		System.out.println	("enter	the			"+length+"	elements");	
		for	(int	i	=	0;	i	<	arr.length;	i++)		
		{	
			arr[i]	=sc.nextInt	();	
		}	
		for	(int	i	=	0;	i	<	arr.length;	i++)		
		{	
			System.out.println	("arr	["+i+"]	‐‐‐‐>"+arr[i]);	
		}
		for (int i = arr.length-1; i >=0; i--) {
			System.out.println(arr[i]);
		}
		
		int[] arrnew=new int[arr.length-1];
		int j=3;
		for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arrnew[k]=arr[i];
                k++;
            }
            
            
        }
		System.out.println("asd"+Arrays.toString(arrnew));
		
		
	}
}
