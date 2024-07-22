package com.tnsif.interfacedemo;

public class Demo implements Childinterface{
	
	
	public void print() {
		System.out.println("print");
	}
	
	
	public void show() {
		System.out.println("show");
	}
	public static void main(String[] args) {
		Demo  d=new Demo();
		d.show();
		d.print();
	}

}
