package com.tnsif.javaque;

import java.util.Scanner;

public class evennum {
	
	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter number");
		
		int i=a.nextInt();
		
		
		if (i%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		
	}

}
