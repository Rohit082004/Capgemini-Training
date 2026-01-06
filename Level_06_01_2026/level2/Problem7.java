// Program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons

import java.util.Scanner;

public class Problem7 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            do {
                System.out.print("Enter weight (kg): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter height (m): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);

            personData[i][2] =
                    personData[i][0] / (personData[i][1] * personData[i][1]);

            double bmi = personData[i][2];

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\nBMI REPORT");
        for (int i = 0; i < number; i++) {
            System.out.printf(
                "Person %d | Height: %.2f m | Weight: %.2f kg | BMI: %.2f | Status: %s%n",
                (i + 1),
                personData[i][1],
                personData[i][0],
                personData[i][2],
                weightStatus[i]
            );
        }

        sc.close();
    }
}
