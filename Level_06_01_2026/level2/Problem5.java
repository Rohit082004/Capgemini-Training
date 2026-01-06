// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order

import java.util.Scanner;

public class Problem5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            index++;
            number /= 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed Number: ");
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i]);
        }

        sc.close();
    }
}
