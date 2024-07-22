package com.tnsif.arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("vishu");
		l.add(2);
		l.add("siddhu");
		l.add(8.9);
		System.out.println("After invoking add() "+l);
		
		l.add(1, "apple");
		
		l.addFirst("v");
		l.addLast("kushi");
		
		//l.remove(0);
		
		System.out.println(l);
		
	}

}
