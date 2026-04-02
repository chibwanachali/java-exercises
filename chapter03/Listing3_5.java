import java.util.Scanner;
public class Listing3_5 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the filing status. Enter: \n 0 for single filers\n 1 for married filing jointly or qualified widow(er)\n 2 for married filing separately\n 3 for head of household");
        int filingStatus = scan.nextInt();

        System.out.println("Enter taxable income:");
        double taxableIncome = scan.nextDouble();
        
        scan.close();
        double tax = 0;

        switch (filingStatus) {
            case 0:
                //compute tax for single filers
                if (taxableIncome <= 8350){
                    tax = taxableIncome * 0.1;
                }
                else if (taxableIncome <= 33950){
                    tax = (8350 * 0.1) + ((taxableIncome - 8350) * 0.15);
                }
                else if (taxableIncome <= 82250){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((taxableIncome - 33950) * 0.25);
                }
                else if (taxableIncome <= 171550){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((taxableIncome - 82250) * 0.28);
                }
                else if (taxableIncome <= 372950){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((taxableIncome - 171550) * 0.33);
                }
                else if (taxableIncome > 372950){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((82250 - 33950) * 0.25) + ((171550 - 82250) * 0.28) + ((372950 - 171550) * 0.33) + ((taxableIncome - 372950) * 0.35);
                }
                break;
            case 1:
                //compute tax for married filing jointly or qualified widow(er)
                if (taxableIncome <= 16700){
                    tax = taxableIncome * 0.1;
                }
                else if (taxableIncome <= 67900){
                    tax = (16700 * 0.1) + ((taxableIncome - 16700) * 0.15);
                }
                else if (taxableIncome <= 137050){
                    tax = (16700 * 0.1) + ((67900 - 16700) * 0.15) + ((taxableIncome - 67900) * 0.25);
                }
                else if (taxableIncome <= 208850){
                    tax = (16700 * 0.1) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((taxableIncome - 137050) * 0.28);
                }
                else if (taxableIncome <= 372950){
                    tax = (16700 * 0.1) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((taxableIncome - 208850) * 0.33);
                }
                else if (taxableIncome > 372950){
                    tax = (16700 * 0.1) + ((67900 - 16700) * 0.15) + ((137050 - 67900) * 0.25) + ((208850 - 137050) * 0.28) + ((372950 - 208850) * 0.33) + ((taxableIncome - 372950) * 0.35);
                }
                break;
            case 2:
                //compute tax for married filing separately
                if (taxableIncome <= 8350){
                    tax = taxableIncome * 0.1;
                }
                else if (taxableIncome <= 33950){
                    tax = (8350 * 0.1) + ((taxableIncome - 8350) * 0.15);
                }
                else if (taxableIncome <= 68525){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((taxableIncome - 33950) * 0.25);
                }
                else if (taxableIncome <= 104425){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((taxableIncome - 68525) * 0.28);
                }
                else if (taxableIncome <= 186475){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((taxableIncome - 104425) * 0.33);
                }
                else if (taxableIncome > 186475){
                    tax = (8350 * 0.1) + ((33950 - 8350) * 0.15) + ((68525 - 33950) * 0.25) + ((104425 - 68525) * 0.28) + ((186475 - 104425) * 0.33) + ((taxableIncome - 186475) * 0.35);
                }
                break;
            case 3:
                //compute tax for head of household
                if (taxableIncome <= 11950){
                    tax = taxableIncome * 0.1;
                }
                else if (taxableIncome <= 45500){
                    tax = (11950 * 0.1) + ((taxableIncome - 11950) * 0.15);
                }
                else if (taxableIncome <= 117450){
                    tax = (11950 * 0.1) + ((45500 - 11950) * 0.15) + ((taxableIncome - 45500) * 0.25);
                }
                else if (taxableIncome <= 190200){
                    tax = (11950 * 0.1) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((taxableIncome - 117450) * 0.28);
                }
                else if (taxableIncome <= 372950){
                    tax = (11950 * 0.1) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((taxableIncome - 190200) * 0.33);
                }
                else if (taxableIncome > 372950){
                    tax = (11950 * 0.1) + ((45500 - 11950) * 0.15) + ((117450 - 45500) * 0.25) + ((190200 - 117450) * 0.28) + ((372950 - 190200) * 0.33) + ((taxableIncome - 372950) * 0.35);
                }
                break;
        }

        System.out.printf("Tax is $%.2f", tax);

    }
}