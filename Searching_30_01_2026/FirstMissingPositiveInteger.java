package Searching_30_01_2026;

import java.util.Scanner;

public class FirstMissingPositiveInteger {
    public static int missingPositiveNum(int[] arr, int n){
        // remove -ve elements and elements greater than array size
        for(int i=0;i<n;i++){
            if(arr[i] <=0 || arr[i] > n){
                arr[i] = n+1;
            }
        }
        // marking visited arr elements
        for(int i=0;i<n;i++){
            int num = Math.abs(arr[i]);
            if(num > n)  continue;

            num--;

            if(arr[num] > 0){
                arr[num] = -1 * arr[num];
            }
        }
        // checking for +ve elements
        for(int i=0;i<n;i++){
            if(arr[i] > 0) return i+1;
        }
        return n+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(missingPositiveNum(arr, n));
    }
}
