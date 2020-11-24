package com.mshakir;

/* Iterator allows the user to go over the list elements one by one. It can access only forward elements. 
 * Iterator Interface has only three main methods. hasNext, next, remove
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		list.add("Muhammad Shakir");
		list.add("Muhammad Sumair");
		list.add("Abdul Basit");
		
		Iterator<String> iter = list.iterator(); 
		
		while(iter.hasNext()) {
			System.out.println( iter.next());
		}
		
	}
}
