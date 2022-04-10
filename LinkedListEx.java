package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();// Creating arraylist
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.add(new Integer(10));
		list.add(new Double(89.00));
		list.add(new Character('a'));
		
		

		System.out.println(list);

		// Traversing list through Iterator
		
		System.out.println("Traversing list through Iterator");
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		//Traversing through for ... each loop
		
		System.out.println("Traversing through for ... each loop");
		
		for(Object obj:list)//
		{
			System.out.println(obj);
		}
		
		
		ListIterator litr=list.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		


	}

}
