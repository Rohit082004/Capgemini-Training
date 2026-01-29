package Stack_Queue_HashMap_29_01_2026.StackQueue_questions;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public static void insertInStack(Stack<Integer> st, int temp){
        if(st.isEmpty() || st.peek() <= temp){
            st.push(temp);
            return;
        }

        int top = st.pop();
        insertInStack(st, temp);
        st.push(top);
    }
    public static void stackSorting(Stack<Integer> st){
        if(st.isEmpty()) return;

        int top = st.pop();

        stackSorting(st);

        insertInStack(st, top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            st.push(v);
        }
        stackSorting(st);
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }
}
