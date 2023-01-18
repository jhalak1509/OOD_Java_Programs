package lec3;

import java.util.Scanner;

public class Lec3_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Value of number:"+getDouble());
	}
	
	public static double getDouble() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		double num = sc.nextDouble();
		return num;
	}

}
