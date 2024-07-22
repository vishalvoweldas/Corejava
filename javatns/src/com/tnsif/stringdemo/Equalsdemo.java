package com.tnsif.stringdemo;

public class Equalsdemo {
	public static void main(String[] args) {
		String s1="vishal";
		String s2="vishal";
		String s3=new String("vishal");
		
		String s4="siddhu";
		
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
