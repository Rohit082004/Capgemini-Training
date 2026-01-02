import java.util.Scanner;

public class PersonIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sal = sc.nextInt();
        int bonus = sc.nextInt();

        int total = sal + bonus;

        System.out.println("The salary is INR " + sal + " and bonus is INR " + bonus +
                           ". Hence Total Income is INR " + total);
    }
}
