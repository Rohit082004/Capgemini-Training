package Collection_Framework_01_02_2026.Queue_Interface;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
    public static void main(String[] args) {
        PriorityQueue<Hospital> pq = new PriorityQueue<>((a,b) -> b.priority - a.priority);
        pq.add(new Hospital("John", 3));
        pq.add(new Hospital("Alice", 5));
        pq.add(new Hospital("Bob", 2));

        while(!pq.isEmpty()){
            Hospital curr = pq.poll();
            System.out.println(curr.name + " " + curr.priority);
        }
    }
}

class Hospital{
    String name;
    int priority;
    public Hospital(String name, int priority){
        this.name = name;
        this.priority = priority;
    }
}
