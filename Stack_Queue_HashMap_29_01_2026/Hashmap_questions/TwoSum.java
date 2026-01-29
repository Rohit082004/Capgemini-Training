package Stack_Queue_HashMap_29_01_2026.Hashmap_questions;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static int[] sumOfTwo(int[] arr, int n, int target){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int comp = target - arr[i];
            if(hm.containsKey(comp)){
                return new int[]{hm.get(comp), i};
            }
            hm.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = sumOfTwo(arr, n, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}


