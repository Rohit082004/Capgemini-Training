package Collection_Framework_01_02_2026.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void queueReverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int t = q.poll();
        queueReverse(q);

        q.add(t);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        queueReverse(q);
        System.out.println(q);
    }
}
