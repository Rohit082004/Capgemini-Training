package Sorting_31_01_2026;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int[] arr, int n){
        for(int i=0;i<n-1;i++){
            boolean swap = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;

                    swap = true;
                }
            }
            if(swap == false) break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
