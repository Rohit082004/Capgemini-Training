package Searching_30_01_2026;

import java.util.Scanner;

public class FindRotationPoint {
    public static int rotationPoint(int[] arr, int n){
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] > arr[e]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int id =rotationPoint(arr, n);
        System.out.println(arr[id]);
    }
}
