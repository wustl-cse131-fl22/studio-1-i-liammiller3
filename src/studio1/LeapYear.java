package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What year is it?");
		int year = in.nextInt();
		
		int fourYear = year % 4;
		int hundredYear = year % 100;
		int fourHundredYear = year % 400;
		
		boolean leapYear = fourYear == 0 && (hundredYear != 0 || fourHundredYear == 0);
		
		System.out.println(year + " is a leap year: " + leapYear);
		
		
	
		
		

	}

}
