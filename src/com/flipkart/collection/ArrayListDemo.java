/**
 * 
 */
package com.flipkart.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author prashant.k5
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		// create or add
		System.out.println("size of collection here-->"+list.size());
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Delhi");
		list.add("Maldives");
		list.add("Sri Lanka");
		list.add("one wo three");
		System.out.println("size of collection here-->"+list.size());
		
		// Remove collection object with value and index
		list.remove("Delhi");
		// removes first occurrence of delhi
		
		System.out.println("after removal size of collection here-->"+list.size());
		
		// list of object printed using collection
		// two ways
		
		// one: old strategy
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String var = i.next();
			System.out.println("Details of cities-->"+ var);
		}
		
		//two: new way, java 8 onwards 11 also
		for(String var: list) {
			System.out.println("Details of cities:-->"+ var);
		}
		
	}

}
