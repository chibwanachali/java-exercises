import java.util.*;
public class Ex8_1{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        } 

        for (int column = 0; column < matrix[0].length; column++){
            System.out.println("Sum of the elements at column " + column + " is " + sumColumn(matrix, column));
        }

    }
    public static double sumColumn(double[][] matrix, int columnIndex){
        double sum = 0;
        for (int row = 0; row < matrix.length; row++){
            sum += matrix[row][columnIndex];
        }
        return sum;
    }
}




/*(Sum elements column by column) Write a method that returns the sum of all the
elements in a specified column in a matrix using the following header:
public static double sumColumn(double[][] m, int columnIndex)
Write a test program that reads a 3-by-4 matrix and displays the sum of each
column. Here is a sample run: */