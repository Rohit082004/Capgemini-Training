package Questions_10_03_2026;

import java.util.Scanner;

public class MissingNumber {
    public static int util(int[] arr, int n){
        int actual = ((n+1) * (n+1+1))/2;
        int sum=0;
        for(int i : arr){
            sum += i;
        }
        return Math.abs(sum-actual);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(util(arr, n));
    }
}
