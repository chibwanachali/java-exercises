import java.util.Scanner;
public class Ex4_11 {
	public static void main (String []args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a decimal value (0 to 15):");
		int w = input.nextInt();
		if (w >= 10) {
			char m = 'A' + (w - 10);
			System.out.printf("The hex value is %c",m);
		}	 
		else 
			System.out.printf("The hex value is %d",w);
	}
}
		