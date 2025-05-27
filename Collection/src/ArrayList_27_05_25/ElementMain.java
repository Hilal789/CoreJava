package ArrayList_27_05_25;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementMain {
	public static Object retrieveElement(ArrayList<Object> ele,int ind)
	{
		if(ele.size()<ind || ind<0)
		{
			throw new IndexOutOfBoundsException("Index not available!");
		}
		
		return ele.get(ind);
		
	}
	public static void main(String[] args) {
		ArrayList<Object> obj=new ArrayList<Object>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements you want to add to the list:");
		int items=sc.nextInt();
		
		for(int i=0; i<items; i++)
		{
				System.out.println("Enter element "+(i+1)+" : ");
				String str=sc.next();
			
				obj.add(str);					
		}
		System.out.println("Enter the index you want to retrieve:");
		int index=sc.nextInt();
		
		try
		{
			Object element = retrieveElement(obj, index-1);
			System.out.println("Element at index "+index+": "+element);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
		
	}

}
