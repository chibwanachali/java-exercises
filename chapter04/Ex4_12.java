import java.util.Scanner;
public class Ex4_12 {
	public static void main (String []args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a Hexadecimal digit:");
		char x = input.next().charAt(0);
		int y;
		if (x >= 'A')
			y = 10 + (int)(x - 'A');
		else
			y = (int)(x - '0');
		System.out.println(y);


		int rem = y % 2;
		int q = y / 2;
		String ans = "" + rem;

		if ( q != 0) {
			rem = q % 2;
			q = q / 2;
			ans = rem + ans;
			if ( q != 0) {
				rem = q % 2;
				q = q / 2;
				ans = rem + ans;
				if ( q != 0) {
					rem = q % 2;
					q = q / 2;
					ans = rem + ans;
					if ( q != 0) {
						rem = q % 2;
						q = q / 2;
						ans = rem + ans;
					}
				}
			}
		}
		System.out.println("The binary value is " + ans);
	}
}
		