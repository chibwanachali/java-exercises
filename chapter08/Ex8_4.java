/* (Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following
array stores the work hours for eight employees. Write a program that displays
employees and their total hours in decreasing order of the total hours. */
import java.util.Arrays;
public class Ex8_4 {
    public static void main ( String[] args){
        int[][] weeklyH =  {{2,4,3,4,5,8,8}, {7,3,4,3,3,4,4}, {3,3,4,3,3,2,2}, {9,3,4,7,3,4,1}, {3,5,4,3,6,3,8
}, {3,4,4,6,3,4,4}, {3,7,4,8,3,8,4}, {6,3,5,9,2,7,9}};

        System.out.println(Arrays.toString(totalH(weeklyH)));

        int[] totalHours = totalH(weeklyH);

        int [][] totalEH = new int[8][2];
         for (int row = 0; row < totalEH.length; row++){
            totalEH[row][0] = row; 
         }

          for (int row = 0; row < totalEH.length; row++){
            totalEH[row][1] = totalHours[row]; 
         }
         int[] temp = new int[2];

         for (int i = 0; i < totalEH.length; i++){
            for (int j = i + 1 ; j < totalEH.length; j++){
                if ( totalEH[i][1] < totalEH[j][1]) {
                    temp = totalEH[i];
                    totalEH[i] = totalEH[j];
                    totalEH[j] = temp;
                }
            }
         }

         for (int i = 0; i < totalEH.length; i++){
            System.out.println(Arrays.toString(totalEH[i]));
         }



    }
    public static int[] totalH (int[][] m){
        int[] totalH = new int[m.length];
        for (int row = 0; row < m.length; row++){
            int sum = 0;
            for (int column = 0; column < m[0].length; column++){
                sum += m[row][column];
            }
            totalH[row] = sum;
        } 
        return totalH;

    }
}