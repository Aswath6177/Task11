package errorhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Secondnumber0 {
public static void main (String[] args)
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter 1st number :");
	float a = scanner.nextInt();
	System.out.println("Enter 2nd number :");
	float b = scanner.nextInt();
	
	try {
		float result = a/b;
		System.out.println("result of indian:"+result );
		
	}
	catch(ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
	}
	catch (InputMismatchException e) {
       
        System.out.println("Error: Please enter valid integers.");
	}
	finally {
		scanner.close();
	}
	
	
	
}
}
