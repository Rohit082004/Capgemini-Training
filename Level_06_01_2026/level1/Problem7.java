// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array

import java.util.Scanner;

public class Problem7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number");
            sc.close();
            return;
        }

        int size = number / 2 + 1;
        int[] even = new int[size];
        int[] odd = new int[size];

        int evenId = 0;
        int oddId = 0;

        for (int i = 1; i <= number; i++) {

            if ((i & 1) == 0) {
                even[evenId] = i;
                evenId++;
            } else {
                odd[oddId] = i;
                oddId++;
            }
        }

        for (int i = 0; i < oddId; i++) {
            System.out.print(odd[i] + " ");
        }

        for (int i = 0; i < evenId; i++) {
            System.out.print(even[i] + " ");
        }

        sc.close();
    }
}
