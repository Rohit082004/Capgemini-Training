package Questions_07_03_2026;

import java.util.Scanner;

public class ArrayRotation {
    public static void reverse(int[] arr, int l, int r){
        while(l <= r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();

        reverse(arr, 0, n-1);
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);

        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
