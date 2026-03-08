package Questions_07_03_2026;

import java.util.Scanner;

public class RatAndFood {
    public static int util(int r, int unit, int n, int[] arr){
        if(arr == null || arr.length == 0) return -1;

        int total = r * unit;
        int sum=0;

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum >= total){
                return i+1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(util(r, unit, n, arr));
    }
}
