package com.tnsif.constructor;

public class Conexample {
	Conexample(){
		System.out.println("default con");
	}
	Conexample(int i){
		System.out.println("welcome");
	}
	Conexample(int i,int j){
		System.out.println("hello world");
	}
	Conexample(int i,String n){
		System.out.println("different type");
	}
	public static void main(String[] args) {
		Conexample c=new Conexample();
		Conexample c1=new Conexample(2);
		Conexample c2=new Conexample(4,"v");
	}

}
