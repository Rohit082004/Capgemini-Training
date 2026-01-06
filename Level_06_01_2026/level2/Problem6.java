// Create a program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;

public class Problem6 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Height (m): ");
            height[i] = sc.nextDouble();
        }

        for (int i = 0; i < n; i++) {

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        System.out.println("\nBMI REPORT");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Height: " + height[i] +
                " m | Weight: " + weight[i] +
                " kg | BMI: " + bmi[i] +
                " | Status: " + status[i]
            );
        }

        sc.close();

    }
}
