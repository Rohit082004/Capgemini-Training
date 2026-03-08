package Questions_07_03_2026;

import java.util.Map;
import java.util.Scanner;

public class AbsoluteDifference {
    public static int util(int[] arr, int n, int num, int diff){
        int count =0;
        for(int i: arr){
            if(Math.abs(i - num) <= diff){
                count++;
            }
        }
        return count == 0 ? -1 : count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();

        System.out.println(util(arr, n, num, diff));
    }
}
