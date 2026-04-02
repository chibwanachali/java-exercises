public class Ex5_3{
	public static void main (String[] args){
		System.out.println("Kilograms      Pounds");
		System.out.println("_______________________");
		double p;
		for ( int n = 0; n < 200; n++) {
			p = (double)(n) * 2.2;
			System.out.printf("%-5d      %-5f\n",n, p);
			}
	}
}
			
		