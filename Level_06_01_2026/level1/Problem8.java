// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors

import java.util.Scanner;

public class Problem8 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int id = 0;

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                if (id == maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];

                    System.arraycopy(factors, 0, temp, 0, factors.length);

                    factors = temp;
                }

                factors[id] = i;
                id++;
            }
        }

        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < id; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();

    }
}
