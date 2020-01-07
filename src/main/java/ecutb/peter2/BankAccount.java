package ecutb.peter2;

public class BankAccount {

    private double balance;     //instance field
    private static double interestRate; //static field

    public static double getInterestRate(){
        return interestRate;
    }

    public static void setInterestRate(double ir){
        interestRate = ir;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}
