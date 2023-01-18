package edu.northeastern.csye6200;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		avg = (num1+num2+num3)/3.0;
		
		System.out.println("The average is:"+avg);
		
	}

}
