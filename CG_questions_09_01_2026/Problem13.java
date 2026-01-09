// reverse array using 2-pointer

import java.util.Scanner;

public class Problem13 {
    public static void reverse(int[] arr, int s, int e) {
        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n-1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
