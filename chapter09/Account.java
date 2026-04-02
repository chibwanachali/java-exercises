import java.util.*;
public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account(){
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

     public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(){
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return this.balance * this.annualInterestRate / 1200;
    }

    public void withdraw(double figure){
        this.balance -= figure;
    }

    public void deposit(double figure){
        this.balance += figure;
    }
}