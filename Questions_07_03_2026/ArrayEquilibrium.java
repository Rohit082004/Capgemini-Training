package Questions_07_03_2026;

import java.util.Scanner;

public class ArrayEquilibrium {
    public static int util(int[] arr, int n){
        if(n == 1) return 0;
        if(n == 2) return -1;

        int total=0;
        for(int i: arr) total += i;

        int left = 0;
        for(int i=0;i<n;i++){
            int right = total - left - arr[i];

            if(left == right){
                return i;
            }

            left += arr[i];
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

        System.out.println(util(arr, n));
    }
}
