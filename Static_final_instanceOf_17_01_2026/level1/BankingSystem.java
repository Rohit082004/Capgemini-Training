public class BankingSystem {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Rohit", 143);
        BankAccount a2 = new BankAccount("Rubez", 206);

        a1.display(a1);
        System.out.println();
        a2.display(a2);
        System.out.println();
        BankAccount.getTotalAccounts();
    }
}

class BankAccount {
    String accountHolderName;

    final int accountNumber;

    static String bankName = "SBI";
    static int totalAcc = 0;

    public BankAccount(String name, int n) {
        this.accountHolderName = name;
        this.accountNumber = n;
        totalAcc++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts : " + totalAcc);
    }

    public void display(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount acc1 = (BankAccount) obj;
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + acc1.accountHolderName);
            System.out.println("Account Number: " + acc1.accountNumber);
        }
        else {
            System.out.println("Not a BankAccount object");
        }
    }
}
