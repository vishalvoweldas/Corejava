package com.tnsif.staticexample;

public class Demo {
	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(1,"uday");
		Student s2=new Student(2,"kushi");
		Student s3=new Student(3,"abhi");
		
		s1.display();
		s2.display();
		s3.display();
		
	}
	

}
