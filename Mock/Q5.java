// leader element

package Mock;

import java.util.Scanner;
import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                st.push(arr[i]);
            }
            else if(arr[i] > st.peek()){
                st.push(arr[i]);
            }
        }

        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
