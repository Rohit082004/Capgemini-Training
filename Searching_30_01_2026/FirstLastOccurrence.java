package Searching_30_01_2026;

import java.util.Scanner;

public class FirstLastOccurrence {
    public static int occurrenceOfElement(int[] arr, int n, int target, boolean flag){
        int s = 0, e = n-1;
        int ans = -1;

        while(s <= e){
            int mid = s + (e-s)/2;

            if(target < arr[mid]){
                e = mid-1;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
            else{
                ans = mid;

                if(flag){
                   e = mid - 1;
                 }
                else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int res[] = {-1, -1};
        res[0] = occurrenceOfElement(arr, n, k, true);
        res[1] = occurrenceOfElement(arr, n, k, false);

        System.out.println(res[0] + " " + res[1]);
    }
}
