package com.tnsif.scanner;
import java.util.Scanner;
public class personexce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter income:");
		int income=sc.nextInt();
		
		person pp=new person();
		pp.setName(name);
		pp.setIncome(income);
		
		taxcalculation t=new taxcalculation();
		t.calculatetax(pp);
		System.out.println("after modification:");
		System.out.println(pp);
		}

}
