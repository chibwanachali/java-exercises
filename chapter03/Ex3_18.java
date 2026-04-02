import java.util.Scanner;
public class Ex3_18 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter weight of goods (in pounds) to be shipped below:");
		String name = input.nextLine();
		input.close();
		double w = Double.parseDouble(name.replaceAll("\\D+",""));
		final double EPSILON = 1E-14;
		System.out.println("Weight of goods: " + w + "lbs.");
		System.out.println( (0 < w && w < 1 || Math.abs(w - 1) < EPSILON)? "Cost of Shipping: $3.5": ((1 < w && w < 3 || Math.abs(w - 3) < EPSILON)? "Cost of Shipping: $5.5": ((3 < w && w < 10 || Math.abs(w - 10) < EPSILON)? "Cost of Shipping: $8.5": ((10 < w && w < 20 || Math.abs(w - 20) < EPSILON)? "Cost of Shipping: $10.5": ""))));
		if ( w > 50 ) {
			System.out.println("The package cannot be shipped.");
		}
	}
}
		
		