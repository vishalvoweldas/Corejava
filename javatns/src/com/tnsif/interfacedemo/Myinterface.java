package com.tnsif.interfacedemo;

public interface Myinterface {
	
	void calculatearea();
	
	//nested interface
	interface Myinnerinterface{
		int id=20;
		void print();
	}

}
