import java.util.Scanner;
public class Ex5_8{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		int numberOfStudents = input.nextInt();
		int i = 0;
		String name = "";
		String hname = "";
		int hscore = 0, score = 0;
		while(i < numberOfStudents){
			System.out.print("Enter the name of Student: ");
			name = input.next();
			System.out.println();
			System.out.print("Enter the score for " + name + ": ");
			score = input.nextInt();

			if (score > hscore) {
				hscore = score;
				hname = name;
			}
			i++;
		}
		System.out.print(hname + " is the highest student with score : " + hscore);
	
	}
}