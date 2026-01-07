// Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;

public class Problem2 {
    public static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int handshake = handshakes(n);

        System.out.println("Number of handsakes = " + handshake);

        sc.close();
    }
}
