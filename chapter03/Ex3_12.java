import java.util.Scanner;
public class Ex3_12 {
	 public static void main (String []args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter any 3 digit number below:");
		int number = input.nextInt();
		input.close();
		int a = number / 100;
		int c = number % 10;

		if (a==c) { 
			System.out.println("The number " + number + " is indeed a palindrome!!");
		}
		else {
			System.out.println("The number " + number + " is NOT a palindrome.");
		}
	}
}
		