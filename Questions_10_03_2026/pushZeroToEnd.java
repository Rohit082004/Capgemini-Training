package Questions_10_03_2026;

import java.util.Scanner;

public class pushZeroToEnd {
    public static int[] util(int[] arr, int n){
        int c=0;
        for(int i: arr){
            if(i == 0) c++;
        }
        int[] ans = new int[n];
        int id=0;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                ans[id++] = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i : util(arr, n)){
            System.out.print(i + " ");
        }
    }
}
