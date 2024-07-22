package com.tnsif.comparableinterface;

import java.util.ArrayList;
//import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		//ArrayList<String> al=new ArrayList<String>();
		//al.add("abc");
		//user defined or  customed class
		
		ArrayList<Student> arl=new ArrayList<Student>();
		
		Student s=new Student(103,"vishal","cse");
		arl.add(s);
		s=new Student(101,"uday","cse");
		arl.add(s);
		s=new Student(102,"kushi","cse");
		arl.add(s);
		
		System.out.println("before sorting"+arl);
		
		System.out.println("aftr sorting ");
		//Collections.sort(arl);
		System.out.println(arl);
		
		
	}

}
