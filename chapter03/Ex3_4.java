public class Ex3_4 {
	public static void main (String[] args) {
		/* (Random month) Write a program that randomly generates an integer between 1 
		and 12 and displays the English month name January, February, …, December for 
		the number 1, 2, …, 12, accordingly. */

		int key = (int)(Math.random() * 12) + 1;
		String month = "";

		switch (key) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;

			case 3:
				month = "March";
				break;

			case 4:
				month = "April";
				break;

			case 5:
				month = "May";
				break;

			case 6:
				month = "June";
				break;

			case 7:
				month = "July";
				break;

			case 8:
				month = "August";
				break;

			case 9:
				month = "September";
				break;

			case 10:
				month = "October";
				break;

			case 11:
				month = "November";
				break;

			case 12:
				month = "December";

		}
		System.out.println(month);
	}
}