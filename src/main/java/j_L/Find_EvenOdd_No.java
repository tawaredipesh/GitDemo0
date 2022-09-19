package j_L;

import java.util.Scanner;

public class Find_EvenOdd_No {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number");
        int num = scan.nextInt();
        
        if (num % 2 == 0)
        {
        	System.out.println("Given number is Even number");
        }
        
        else 
        {
        	System.out.println("Given number is Odd Number");
        }
        System.out.println(num);
	}

}
