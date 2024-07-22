package com.tnsif.javaque;

import java.util.Scanner;

public class num {
	
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter number");
		int i=a.nextInt();
		
		if(i==0) {
			System.out.println("number is zero");
		}
		else {
			System.out.println("number is not zero");
		}
	}

}
