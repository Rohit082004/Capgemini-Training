package Encapsulation_Polymorphism_20_01_2026;

import java.util.ArrayList;
import java.util.List;

public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> al = new ArrayList<>();

        BankAccount s = new SavingsAccount("SA101", "Rohit", 80000);
        BankAccount c = new CurrentAccount("CA202", "Rubez", 150000);

        al.add(s);
        al.add(c);

        for (BankAccount acc : al) {

            double interest = acc.calculateInterest();

            System.out.println("Account Holder : " + acc.getHolderName());
            System.out.println("Account No : " + acc.getAccountNumber());
            System.out.println("Balance : " + acc.getBalance());
            System.out.println("Interest : " + interest);

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                System.out.println("Loan Eligible: " + loanAcc.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    double balance;

    BankAccount(String accNo, String name, double bal){
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public abstract double calculateInterest();

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 50000;
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: ₹" + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return balance >= 100000;
    }
}


