// stability in swapping

package Mock;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i=i+2){
            if(arr[i] > arr[i+1]){
                int t = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = t;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
