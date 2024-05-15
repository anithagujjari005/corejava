package com.tnsif.collectiondemo;
import java.util.ArrayList;
import java.util.Iterator;

public class Gnericsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al=new ArrayList<String>();
		al.add("rahul");
		al.add("jai");
		String s=al.get(1);
		System.out.println(s);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {     // check the data present or not
			System.out.println(itr.next()); // read and move to next
		}

	}

}
