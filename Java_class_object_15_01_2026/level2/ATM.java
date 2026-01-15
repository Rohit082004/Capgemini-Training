public class ATM {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 123456789, 1000);

        // a1.depositing(500);
        // a1.depositing(900);
        a1.withdrawing(1001);
        // a1.depositing(600);

        a1.display();
    }
}

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccount(String holder, int number, double b) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = b;
    }

    public void depositing(double deposit) {
        balance += deposit;
    }

    public void withdrawing(double withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficient balance to withdraw");
            
        } else {
            balance -= withdraw;
        }
    }
    
    public void display() {
        System.out.println("Account holder name : " + accountHolder);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Remaining balance : " + balance);
    }
    
}
