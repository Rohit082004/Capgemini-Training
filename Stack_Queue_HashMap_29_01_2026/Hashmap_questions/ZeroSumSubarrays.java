package Stack_Queue_HashMap_29_01_2026.Hashmap_questions;

import java.util.HashMap;
import java.util.Scanner;

public class ZeroSumSubarrays {
    public static int subarraySumZero(int[] arr, int n){
        int ans =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(hm.containsKey(sum)){
                ans += hm.get(sum);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subarraySumZero(arr, n));
    }
}
