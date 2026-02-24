// odd index stability

package Mock;

import java.util.Scanner;

public class Q2 {
    public static void reverse(int[] arr, int l, int r){
        while(l <= r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r]=t;
            l++;
            r--;
        }
    }

    public static void util(int[] arr, int n){
        int len =0;
        if(n % 2 == 0) len= n/2;
        else len = n/2 + 1;

        int[] even=new int[len];
        int id=0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0)
                even[id++] = arr[i];
        }
        reverse(even, 0,even.length-1);
        reverse(even, 1,even.length-1);

        id=0;
        for(int i=0;i<n;i++){
            if(i % 2 == 0){
                arr[i] = even[id++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        util(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
