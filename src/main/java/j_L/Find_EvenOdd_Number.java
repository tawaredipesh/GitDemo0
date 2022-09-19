package j_L;

import java.util.Scanner;

public class Find_EvenOdd_Number {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter Number");
	     int number = scan.nextInt();
	     
	     if(number % 2==0)
	     {
	    	 System.out.println("Given Number is Even Number");
	     }
	     else 
	     {
	    	 System.out.println("Given Number is Odd Number");
	     }
	}

}
