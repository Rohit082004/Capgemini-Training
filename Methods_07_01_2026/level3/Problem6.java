import java.util.Scanner;

public class Problem6 {
     public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max)
                max = f;
        }
        return max;
    }
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum == number;
    }
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum > number;
    }
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = 0;
        for (int f : factors) {
            if (f != number)
                sum += f;
        }
        return sum < number;
    }
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
     @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));

        System.out.println("Is Perfect Number: " + isPerfectNumber(number, factors));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number, factors));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number, factors));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

        sc.close();
    }
}
