import java.util.Scanner;
public class Ex8_12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the filing status. Enter: \n 0 for single filers\n 1 for married filing jointly or qualified widow(er)\n 2 for married filing separately\n 3 for head of household");
        int filingStatus = scan.nextInt();

        System.out.println("Enter taxable income:");
        double taxableIncome = scan.nextDouble();
        
        scan.close();

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        int[][] brackets = {{8350, 33950, 82250, 171550, 372950}, // Single filer
                            {16700, 67900, 137050, 20885, 372950}, // Married jointly-or qualifying widow(er)
                            {8350, 33950, 68525, 104425, 186475}, // Married separately
                            {11950, 45500, 117450, 190200, 372950} // Head of household
                            };

        double tax = 0;

       for (int i = 0; i < brackets[filingStatus].length; i++){
        if (taxableIncome > brackets[filingStatus][i]){
            if (i == 0)
                tax += brackets[filingStatus][i] * rates[i];
            else if(i != 4)
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
            else if(i == 4){
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];
                tax += (taxableIncome - brackets[filingStatus][i]) * rates[i + 1];
            }

            
        }
        else {
            if (i == 0)
                tax = taxableIncome * rates[i];
            else
                tax += (taxableIncome - brackets[filingStatus][i - 1]) * rates[i];
                break;
       }
    }

    System.out.printf("Tax is $%.2f", tax);
    
    }
}