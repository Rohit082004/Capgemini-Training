package Collection_Framework_01_02_2026.Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBufferSimulation {
    public static Queue<Integer> insertIntoBuffer(int buffer, int[] arr){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(q.size() == buffer){
                q.poll();
            }
            q.add(arr[i]);
        }
        return q;
    }
    public static void main(String[] args) {
        int buffer = 3;
        int[] arr = {1,2,3,4};

        System.out.println(insertIntoBuffer(buffer, arr));
    }
}
