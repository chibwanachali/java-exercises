import java.util.Scanner;
public class Ex4_15 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a letter below: ");
		String input = scan.next();
		input = input.toUpperCase();

		char guess = input.charAt(0);

		if ( 'A' <= guess && 'C' >= guess) 
			System.out.printf("The corresponding number is 2");
			
		else if ( 'D' <= guess && 'F' >= guess) 
			System.out.printf("The corresponding number is 3");
			
		else if ( 'G' <= guess && 'I' >= guess) 
			System.out.printf("The corresponding number is 4");

		else if ( 'J' <= guess && 'L' >= guess) 
			System.out.printf("The corresponding number is 5");

		else if ( 'M' <= guess && 'O' >= guess) 
			System.out.printf("The corresponding number is 6");

		else if ( 'P' <= guess && 'S' >= guess) 
			System.out.printf("The corresponding number is 7");

		else if ( 'T' <= guess && 'V' >= guess) 
			System.out.printf("The corresponding number is 8");

		else if ( 'W' <= guess && 'Z' >= guess) 
			System.out.printf("The corresponding number is 9");
		else 
			System.out.println("Invalid Input!");
			System.exit(1);

	}
}

		