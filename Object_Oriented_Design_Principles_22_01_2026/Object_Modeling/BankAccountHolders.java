package Object_Oriented_Design_Principles_22_01_2026.Object_Modeling;

import java.util.ArrayList;

public class BankAccountHolders {
    public static void main(String[] args) {
        Bank hdfc = new Bank("HDFC Bank");
        Bank sbi = new Bank("SBI Bank");

        Customer c1 = new Customer("Rohit");
        Customer c2 = new Customer("Rubez");

        hdfc.openAccount(c1, 50000);
        sbi.openAccount(c2, 30000);

        c1.viewBalance();
        c2.viewBalance();
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new ArrayList<>();
    }

    void openAccount(Customer customer, double initialBalance) {
        customer.balance = initialBalance;
        customer.bank = this;
        customers.add(customer);

        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }
}

class Customer {
    String name;
    double balance;
    Bank bank;   // reference to Bank (association)

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println("Customer name : " + name);
        System.out.println("Balance : " + balance);
        System.out.println("Bank : " + bank.bankName);
    }
}
