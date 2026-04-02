import java.util.*;
public class Ex8_2{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];

        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        } 

            System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }
    public static double sumMajorDiagonal(double[][] matrix){
        double sum = 0;
        for (int row = 0; row < matrix.length; row++){
            sum += matrix[row][row];
        }
        return sum;
    }
}
