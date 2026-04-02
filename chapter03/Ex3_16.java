public class Ex3_16 {
	public static void main (String [] args) {
		String sign1 = (Math.random() < 0.5)? "+" : "-" ;
		String sign2 = (Math.random() < 0.5)? "+" : "-" ;
		// width = 100 and height = 200 ;
		int x = (int)(Math.random() * 51);
		int y = (int)(Math.random() * 101);

		System.out.println("The co-ordinates (x,y) = (" + sign1 + x + "," + sign2 + y + ") lies in the rectangle of width = 100 and height = 200, centered at (0,0).");
	}
}