package Searching_30_01_2026;

import java.util.Scanner;

public class FirstNegativeNumber {
    public static int negativeNum(int[] arr, int n, int target){
        for(int i=0;i<n;i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(negativeNum(arr, n, k));
    }
}
