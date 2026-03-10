package Questions_10_03_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MiddleElement {
    public static int util(int[] arr, int n){
        List<Integer> al = new ArrayList<>();
        for(int i : arr){
            if(i >= 0){
                al.add(i);
            }
        }
        return al.get((al.size() / 2) -1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println(util(arr, n));
    }
}
