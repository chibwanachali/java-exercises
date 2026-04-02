import java.util.Scanner;
public class MyIntegerTest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer below:");
        //int temp = ;
        MyInteger int1 = new MyInteger(input.nextInt());
        System.out.printf("The integer you entered is %d. \n", int1.getValue());

        if (int1.isEven())
            System.out.println("It is an even number!");
        else
            System.out.println("It is an odd number.");
        input.close();

        if (int1.isPrime())
            System.out.println("It is a Prime number!");
        else
            System.out.println("It is NOT a Prime number.");

    }
}