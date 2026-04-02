import java.util.Scanner;
public class Ex5_2 {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		int a;
		int b;
		int answer;
		int key;
		int count = 0;
		int q = 1;
		do {
			answer = 0;
			a = (int)(Math.random() * 16);
			b = (int)(Math.random() * 16);
			key = a + b;
			System.out.printf("%d. %d + %d =", q, a, b);
			answer = input.nextInt();
			if (answer == key) {
				count++;
				}
			q++;
		} while (q <11);
		System.out.printf("You scored %d/10 ", count);
	}
}

				
			