// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.

import java.util.Scanner;

public class Problem3 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int[] arr = new int[10];
        int id = 0;

        while (num > 0) {
            arr[id++] = num % 10;
            num = num / 10;
        }

        int second = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }

            else if (arr[i] > second && arr[i] < largest) {
                second = arr[i];
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second Largest element = " + second);

        sc.close();
    }
}
