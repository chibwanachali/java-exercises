public class Ex9_7{
    public static void main(String[] args){
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.printf("Account 1 balance: $%.2f \n", account1.getBalance());
        System.out.printf("Monthly interest: $%.2f \n", account1.getMonthlyInterest());

        System.out.println("Date created: " + account1.getDateCreated().toString());

    }
}