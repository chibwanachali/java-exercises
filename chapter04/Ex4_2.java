import java.util.Scanner;
public class Ex4_2 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);

		System.out.println("Please enter the latitude and longitude of point 1 in the form (latitude,longitude) below:");
		String coordinates1 = scan.nextLine();
		
		coordinates1 = coordinates1.replace("(","").replace(")","");
		String[] values1 = coordinates1.split(",");

		double x1 = Double.parseDouble(values1[0]);
		double y1 = Double.parseDouble(values1[1]);


		System.out.println(x1);
		System.out.println(y1);
		
		System.out.println("Please enter the latitude and longitude of point 2 in the form (latitude,longitude) below:");
		String coordinates2 = scan.nextLine();
		
		coordinates2 = coordinates2.replace("(","").replace(")","");
		String[] values2 = coordinates2.split(",");
		double x2 = Double.parseDouble(values2[0]);
		double y2 = Double.parseDouble(values2[1]);


		System.out.println(x2);
		System.out.println(y2);

		final double RADIUS_OF_EARTH = 6371.01;

		double d = RADIUS_OF_EARTH * Math.acos( Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)) );

		System.out.printf("The distance between the two points is %f km. ", d);
	}
}