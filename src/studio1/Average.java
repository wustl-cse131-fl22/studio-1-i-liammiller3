package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What's the first number to be averaged?");
		int n1 = in.nextInt();
		System.out.println("What's the second number to be averaged?");
		int n2 = in.nextInt();
		double avgValue = (n1 + n2) / 2.0;
		System.out.println("Average = " + avgValue);
			
		
		
		
		


	}

}
