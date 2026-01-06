//Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result

import java.util.Scanner;

public class Problem5 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        int[] result = new int[4];

        int id = 0;
        for (int i = 6; i <= 9; i++) {
            result[id] = number * i;
            id++;
        }

        id = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[id]);
            id++;
        }

        sc.close();
    }
}
