package com.tnsif.javaque;

public class newmethod extends quemethod{
	@Override
	int car() {
		
		System.out.println("benz");
		return 0;
		
	}
	public static void main(String[] args) {
		newmethod a=new newmethod();
		a.car();
	}

}
