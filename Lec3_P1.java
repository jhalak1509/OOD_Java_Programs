package lec3;

//import java.util.Scanner;

public class Lec3_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 1.0;
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the value of x:");
		 
		
		while(x<=32.0) {
			System.out.printf("2^%.0f = %.0f%n", x, Math.pow(2.0,x));
			x++;
		}
	}

}
 