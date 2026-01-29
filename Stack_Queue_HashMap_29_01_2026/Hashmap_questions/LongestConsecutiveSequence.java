package Stack_Queue_HashMap_29_01_2026.Hashmap_questions;

import java.util.HashMap;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static int consecutiveSequence(int[] arr, int n){
        int ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){

            if(hm.containsKey(arr[i])){
                continue;
            }

            int l = 0, r = 0;

            if(hm.containsKey(arr[i] - 1))
                l = hm.get(arr[i] - 1);

            if(hm.containsKey(arr[i] + 1))
                r = hm.get(arr[i] + 1);

            int len = l + r + 1;

            hm.put(arr[i], len);

            if(l > 0)
                hm.put(arr[i]- l, len);

            if(r > 0)
                hm.put(arr[i] + r, len);

            ans = Math.max(ans, len);
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

        System.out.println(consecutiveSequence(arr, n));
    }
}
