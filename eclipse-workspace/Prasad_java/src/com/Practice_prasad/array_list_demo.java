package com.Practice_prasad;

import java.util.ArrayList;
import java.util.Iterator;

public class array_list_demo {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("prasad");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(400);
		mylist.add(null);
		mylist.add(2, "java");
		System.out.println("arraylist size : "+mylist.size());
		System.out.println("printing data from arraylist : " +mylist);
		System.out.println("remove value from arraylist :" +mylist.remove(5));
		System.out.println("insert value in arraylist : " +mylist);
		mylist.set(2, "jitendra");
		System.out.println("modify value :" +mylist);
		System.out.println(mylist.get(6));
		Iterator it=mylist.iterator();
		while(it.hasNext())//it is check value is present or not
		{
			System.out.println(it.next());//get the value
			
		}

	}

}
