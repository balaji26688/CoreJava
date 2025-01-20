package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StringReverse {

	//@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	List<Integer> li=new ArrayList<>();
	for(int i=0;i<10;i++)
	{
		li.add(i);
	}
	
	for(int l:li)
	{
		System.out.println(l);
	}
	System.out.println(li.contains(5));
	li.addFirst(11);
	System.out.println(li);
	li.addLast(12);
	System.out.println(li);
	li.addFirst(0);
	System.out.println(li);
	System.out.println(li.getFirst());
	System.out.println(li.getLast());
	System.out.println(li.indexOf(1));
	System.out.println(li.isEmpty());
	li.set(6,8);
	System.out.println(li);

	System.out.println(li.lastIndexOf(6));
	System.out.println(li.reversed());
	//li.set(0, null);
	//li.spliterator();
	System.out.println(Collections.max(li));
	Collections.binarySearch(null, null);
	List<Integer> lil=new LinkedList<Integer>();
	

		
		
	}

}
