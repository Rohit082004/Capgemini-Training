// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year is not valid (Gregorian calendar starts from 1582)");
        } else {

            // Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Using if-else: Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Using if-else: Year is a Leap Year");
            } else {
                System.out.println("Using if-else: Year is not a Leap Year");
            }

            // Using single if statement and logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Using single if: Year is a Leap Year");
            } else {
                System.out.println("Using single if: Year is not a Leap Year");
            }
        }

        sc.close();

    }
}