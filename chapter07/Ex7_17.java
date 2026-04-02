import java.util.*;
public class Ex7_17{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int num = input.nextInt();
        input.nextLine();

        //Create arrays for student names and their scores
        String[] sNames = new String[num];
        int[] sScore = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.println("Enter name for student " + i);
            sNames[i] = input.nextLine();
        }

        for (int i = 0; i < num; i++){
            System.out.println("Enter score for student " + sNames[i]);
            sScore[i] = input.nextInt();
        }
        int tempI = 0;
        String tempS = "";
        for (int i = num - 1; i >= 0; i--){
            for (int j = 0; j < i; j++){
                if (sScore[j] < sScore[i]){
                    tempI = sScore[i]; 
                    tempS = sNames[i];

                    sScore[i] = sScore[j];
                    sNames[i] = sNames[j]; 

                    sNames[j] = tempS;
                    sScore[j] = tempI;
                }
            }
        }

            System.out.println("|       NAME       |      SCORE      |");
            System.out.println("_____________________________________");

            for (int i = 0; i < num; i++){
                System.out.printf("|%18s|%11d      |", sNames[i], sScore[i]);
                System.out.println("");

            }
        }
}

/* Write a program that prompts the user to enter the number of students, 
the students’ names, and their scores, 
and prints student names in decreasing order of their scores. */