package Collection_Framework_01_02_2026.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void binaryNum(int n, Queue<String> q){
        for(int i=0;i<n;i++){
            String curr = q.poll();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        Queue<String> q = new LinkedList<>();
        q.add("1");

        binaryNum(n, q);
    }
}
