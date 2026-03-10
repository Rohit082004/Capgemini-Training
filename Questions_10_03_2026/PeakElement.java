package Questions_10_03_2026;

import java.util.Scanner;

public class PeakElement {
    public static int util(int n, int[] arr){
        for(int i=1;i<n-1;i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(util(n, arr));
    }
}
