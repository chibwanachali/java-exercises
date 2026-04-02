public class Ex5_7 {
	public static void main (String[] args){
		double tuition = 10000;
		int n = 0;
		double sum = 0;
		while (n <= 14) {
			tuition *= 1.05;
			n++;
			if (n == 10) {
				System.out.printf("The tuition fee is : $%7.2f\n", tuition);
			}	
			if (n > 10) {
				sum += tuition;
			}
		}
		System.out.printf("The total tuition fee for Four years is : $%8.2f", sum);
	}
}
		