public class Tax {
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW_ER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int[][] brackets = {{8350, 33950, 82250, 171550, 372950}, // Single filer
                        {16700, 67900, 137050, 20885, 372950}, // Married jointly-or qualifying widow(er)
                        {8350, 33950, 68525, 104425, 186475}, // Married separately
                        {11950, 45500, 117450, 190200, 372950} // Head of household
                         };

    private double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    private double taxableIncome;

    public Tax(){
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus(){
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus){
        this.filingStatus = filingStatus;
    }

    public double getTax(){
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
        return tax;
    }

    




}