//Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results

import java.util.Scanner;

public class Problem10 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer");
            sc.close();
            return;
        }

        String[] result = new String[number];

        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[i - 1] = "Buzz";
            }
            else {
                result[i - 1] = String.valueOf(i);
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + result[i]);
        }
        sc.close();
    }
}
