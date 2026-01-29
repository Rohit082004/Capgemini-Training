package Stack_Queue_HashMap_29_01_2026.StackQueue_questions;

import java.util.Stack;

public class ImplementQueue {
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();

    public void enqueue(int x) {
        input.push(x);
    }

    public int dequeue() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }

        if (output.isEmpty()) {
            return -1;
        }

        return output.pop();
    }

    public static void main(String[] args) {
        ImplementQueue q = new ImplementQueue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        q.enqueue(40);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
