import java.util.Scanner;
public class Ex4_1 {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter the length from the center of a pentagon to a vertex below: ");
		double r = input.nextDouble();
		double s = (2 * r) * Math.sin(Math.PI/5);
		double area = (5 * Math.pow(s,2))/(4 * Math.tan(Math.PI/5));

		System.out.printf("The area of the pentagon with r = %2.2f cm and s = %2.2f cm is %2.2f cm^2!",r,s,area);

	}
}



