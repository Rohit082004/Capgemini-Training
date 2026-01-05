// Create a program to check if a number is armstrong or not

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;
        int digits = 0;

        while(temp > 0){
            digits++;
            temp = temp / 10;
        }

        int sum = 0;
        temp = number;

        while (temp != 0) {

            int digit = temp % 10;

            sum += Math.pow(digit, digits);

            temp = temp / 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();

    }
}
