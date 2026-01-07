// Write a program to check whether a number is positive, negative, or zero

import java.util.Scanner;

public class Problem4 {
    public static int checkNumber(int num) {
        if (num > 0)
            return 1;
        else if (num < 0)
            return -1;
        else
            return 0;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int res = checkNumber(number);

        switch (res) {
            case 1:
                System.out.println("The number is Positive");
                break;
            case -1:
                System.out.println("The number is Negative");
                break;
            default:
                System.out.println("The number is Zero");
                break;
        }

        sc.close();

    }
}
