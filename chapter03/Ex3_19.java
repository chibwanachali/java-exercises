import java.util.*;
public class Ex3_19 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter value for first side of the triangle below:");
		String side1 = input.nextLine();
		int a = Integer.parseInt(side1.replaceAll("\\D+",""));

		System.out.println("Please enter value for second side of the triangle below:");
		String side2 = input.nextLine();
		int b = Integer.parseInt(side2.replaceAll("\\D+",""));

		System.out.println("Please enter value for third side of the triangle below:");
		String side3 = input.nextLine();
		int c = Integer.parseInt(side3.replaceAll("\\D+",""));


		if ((a + b > c) && (b + c > a) && (a + c > b)) {
			int perimeter = a + b + c;
			System.out.println("The perimeter of the triangle with sides " + a + "cm, " + b + "cm, and " + c + "cm is " + perimeter + "cm.");
			}

		else { 
			System.out.println("Input is invalid!");
			}
			input.close();
	}
}

		