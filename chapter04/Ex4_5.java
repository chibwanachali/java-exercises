import java.util.Scanner;
public class Ex4_5 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Enter the number of sides:");
		double n = scan.nextDouble();
		System.out.println("Enter the side:");
		double s = scan.nextDouble();

		double area = (n * Math.pow(s,2))/(4 * Math.tan(Math.PI/n));

		System.out.printf("The area of the polygon is %f", area);
	}
}
	
		

		