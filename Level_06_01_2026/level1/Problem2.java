// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less

import java.util.Scanner;

public class Problem2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {

            if (arr[i] > 0) {
                if ((arr[i] & 1) == 0) {
                    System.out.println(arr[i] + " is a positive even number");
                } else {
                    System.out.println(arr[i] + " is a positive odd number");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is a negative number");
            }
            else {
                System.out.println(arr[i] + " is zero");
            }
        }

        if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First and last elements are equal");
        }
        else if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First element is greater than last element");
        }
        else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }
}
