import java.util.Scanner;
public class Ex3_11 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the month and the year below respectively:");
		int month = input.nextInt();
		int year = input.nextInt();
		input.close();

		if (month == 1)
			System.out.println("January " + year + "had 31 days.");
		if (month == 2) {
			if (Math.abs(year - 2012) % 4 == 0 ) {
				System.out.println("February " + year + "had 29 days.");
			}
			else {
				System.out.println("February " + year + " had 28 days.");
			}
		}
		if (month == 3)
			System.out.println("March " + year + "had 31 days.");
		if (month == 4)
			System.out.println("April " + year + "had 30 days.");	
		if (month == 5)
			System.out.println("May " + year + "had 31 days.");
		if (month == 6)
			System.out.println("June " + year + "had 30 days.");
		if (month == 7)
			System.out.println("July " + year + "had 31 days.");
		if (month == 8)
			System.out.println("August " + year + "had 31 days.");
		if (month == 9)
			System.out.println("September " + year + "had 30 days.");
		if (month == 10)
			System.out.println("October " + year + "had 31 days.");
		if (month == 11)
			System.out.println("November " + year + "had 30 days.");
		if (month == 12)
			System.out.println("December " + year + "had 31 days.");
	}
}



		
		
		
		