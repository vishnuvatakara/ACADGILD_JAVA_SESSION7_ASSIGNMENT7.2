package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
String str;
Sort()
{
	Scanner sc=new Scanner(System.in);
	int i,j;
	System.out.println("enter the string");
	str=sc.nextLine();                      //reading string with spaces
	String str1[]=str.split("\\s");			//splitting string by words
	System.out.println("string by words");
	for(String s:str1)
	{
		System.out.println(s);				//displaying string by words
	}
	String temp;
	int len=str1.length;					//finding length of array string str1
	for(i=0;i<len;++i)
	{	for(j=i+1;j<len;++j)				//performing sorting algorithms for words
		{
			if(str1[i].compareTo(str1[j])>0)	// comparing word by string compare method
			{
				temp=str1[i];
				str1[i]=str1[j];			// swaping words by alphabat order
				str1[j]=temp;
			}
		}
	}
	System.out.println("sorted string in the form sorting charactor by word is.......");
	for(i=0;i<len;++i)
	{
		char ar[]=str1[i].toCharArray();	//converting each word into array of char
		Arrays.sort(ar);					//sorting array of character
		String sorted=new String(ar);		//assigning array of character into new string
		System.out.printf(sorted+" ");		//displaying each word into sorted form
	
	}
		
	
}
public static void main(String args[])
{
	Sort obj=new Sort();
}
}
