package LinkedList_28_01_2026;

public class TaskScheduler {
    public static void main(String[] args) {
        Scheduler ll = new Scheduler();

        ll.addAtBeginning(1, "Design", 1, "10-02-2026");
        ll.addAtEnd(2, "Coding", 2, "15-02-2026");
        ll.addAtEnd(3, "Testing", 1, "20-02-2026");
        ll.addAtPosition(2, 4, "Review", 3, "12-02-2026");

        ll.displayAll();

        ll.viewCurrentAndNext();
        ll.viewCurrentAndNext();

        ll.searchByPriority(1);

        ll.removeByTaskId(2);
        ll.displayAll();
    }
}

class Scheduler {
    TaskNode head, current;

    void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void addAtEnd(int id, String name, int priority, String date) {
        TaskNode newNode = new TaskNode(id, name, priority, date);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }
        TaskNode newNode = new TaskNode(id, name, priority, date);
        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++)
            temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeByTaskId(int id) {
        if (head == null)
            return;

        TaskNode temp = head, prev = null;

        do {
            if (temp.taskId == id) {
                if (prev == null) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    if (head.next == head) {
                        head = current = null;
                        return;
                    }
                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = temp.next;
                    if (temp == current)
                        current = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentAndNext() {
        if (current == null)
            return;
        System.out.println(current.taskId + " " + current.taskName + " " + current.priority + " " + current.dueDate);
        current = current.next;
    }

    void displayAll() {
        if (head == null)
            return;
        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    void searchByPriority(int priority) {
        if (head == null)
            return;
        TaskNode temp = head;
        do {
            if (temp.priority == priority)
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
