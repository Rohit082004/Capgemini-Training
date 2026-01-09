// missing number in an array

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int aSum = (n * (n +1)) / 2;
        int cSum = 0;
        for (int i : arr) {
            cSum += i;
        }
        System.out.println(aSum - cSum);
    }
}
