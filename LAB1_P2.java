package edu.northeastern.csye6200;

import java.util.Scanner;

public class LAB1_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number of yards: ");
		int yards= sc.nextInt();
		System.out.println("Enter number of feet: ");
		int feet= sc.nextInt();
		System.out.println("Enter number of inches: ");
		int inches= sc.nextInt();
		int total= (36*yards + 12*feet + inches);
		System.out.println("Total number of inches:  "+ total);

	}

}
