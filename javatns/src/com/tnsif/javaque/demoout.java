package com.tnsif.javaque;

public class demoout implements newinterface.exinterface{
	
	public static void main(String[] args) {
		
		System.out.println("nested interface");
		demoout j=new demoout();
		j.print();
		System.out.println(demoout.num);
	}

	public void print() {
		
	 System.out.println("number");
		
	}

}
