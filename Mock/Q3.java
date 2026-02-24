// balanced split check

package Mock;

import java.util.Scanner;

public class Q3 {
    public static boolean util(int[] arr, int n){

        for(int i=0;i<n;i++){
            int sumL=0, sumR=0;

            for(int j=0;j<=i;j++){
                sumL += arr[j];
            }
            for(int k=i+1;k<n;k++){
                sumR += arr[k];
            }

            if(sumL == sumR) return true;
        }
        return false;
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
