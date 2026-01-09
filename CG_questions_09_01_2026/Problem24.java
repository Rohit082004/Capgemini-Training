// rotate an array left/right

import java.util.Scanner;

public class Problem24 {
    public static void reverse(int[] arr, int s, int e) {
        while (s <= e) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n - 1);
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
