package Sorting_31_01_2026;

import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] arr, int l, int r){
        int mid = l + (r-l)/2;
          
        int l1 = mid-l+1;
        int l2 = r-mid;
        int[] f = new int[l1];
        int[] s = new int[l2];
        int arridx = l;
        for(int i=0;i<l1;i++){
            f[i] = arr[arridx++];
        }
        arridx = mid+1;
        for(int i=0;i<l2;i++){
            s[i] = arr[arridx++];
        }

        int id1 = 0;
        int id2 = 0;
        arridx = l;
        while(id1 < l1 && id2 <l2){
            if(f[id1] < s[id2]){
                arr[arridx++] = f[id1++];
            }
            else{
                arr[arridx++] = s[id2++];
            }
        }
        while(id1 < l1){
            arr[arridx++] = f[id1++];
        }
        while(id2 < l2){
            arr[arridx++] = s[id2++];
        }
    }
    public static void mergeSort(int[] arr, int l, int h) {
        if(l < h){
            int mid = l + (h-l)/2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, h);

            merge(arr, l, h);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
