// max difference with constraints

package Mock;

import java.util.Scanner;

public class Q4 {
    public static int util(int[] arr, int n){
        int max=0;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int diff = arr[j]-arr[i];
                max = Math.max(max, diff);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(util(arr,n));
    }
}
