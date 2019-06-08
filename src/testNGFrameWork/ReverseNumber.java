package testNGFrameWork;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num , reversed = 0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any number:");
        num =s.nextInt();
        
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    
	}

}
