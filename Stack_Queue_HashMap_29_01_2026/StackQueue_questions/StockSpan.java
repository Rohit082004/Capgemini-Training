package Stack_Queue_HashMap_29_01_2026.StackQueue_questions;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++) {
            while (!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = i - st.peek();
            } else {
                res[i] = i + 1;
            }

            st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = calculateSpan(arr);

        for(int i: ans){
            System.out.print(i + " ");
        }
    }
}
