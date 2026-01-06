// Create a program to find the mean height of players present in a football team.

import java.util.Scanner;

public class Problem6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
        }

        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("Mean height of the football team = " + mean);

        sc.close();
    }
}
