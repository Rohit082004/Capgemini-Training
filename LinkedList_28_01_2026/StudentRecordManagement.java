package LinkedList_28_01_2026;

import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Student ll = new Student();

        ll.addAtBeginning(2179, "Rohit", 21, 'A');
        ll.addAtBeginning(2188, "Rubez", 20, 'A');
        ll.addAtEnd(2135, "Samarpit", 21, 'A');
        ll.addAtPosition(2195, "Rupika", 21, 'B', 2);

        ll.deleteByRoll(2195);

        System.out.println(ll.searchByRoll(2179));

        ll.updateGrade(2135, 'B');

        ll.displayLL();
    }
}

class Student{
    Node head= null;

    void addAtBeginning(int roll, String name, int age, char grade){
        Node n1 = new Node(roll, name, age, grade);
        n1.next = head;
        head = n1;
    }

    void addAtEnd(int roll, String name, int age, char grade){
        Node n1 = new Node(roll, name, age, grade);
        if(head == null){
            head = n1;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = n1;
    }

    void addAtPosition(int roll, String name, int age, char grade, int pos){
        if(pos == 1){
            addAtBeginning(roll, name, age, grade);
        }

        Node n1 = new Node(roll, name, age, grade);
        Node temp= head;
        int i=1;

        while(i < pos-1 && temp != null){
            temp = temp.next;
            i++;
        }
        if(temp == null) return;

        n1.next = temp.next;
        temp.next =n1;
    }

    void deleteByRoll(int roll){
        Node curr = head;
        Node prev = null;

        if(head == null) return;

        if(head.rollNo == roll){
            head = head.next;
            return;
        }

        while(curr != null){
            if(curr.rollNo == roll){
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr= curr.next;
        }
    }

    String searchByRoll(int roll){
        Node curr = head;
        while(curr != null) {
            if(curr.rollNo == roll){
                return curr.name;
            }
            curr = curr.next;
        }
        return "Not found";
    }

    void updateGrade(int roll, char newGrade){
        Node temp = head;

        while(temp != null){
            if(temp.rollNo == roll){
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }

    void displayLL(){
        Node curr = head;
        while(curr != null){
            System.out.println(curr.rollNo + " " + curr.name + " " + curr.age + " " + curr.grade);
            curr = curr.next;
        }
    }
}

class Node{
    int rollNo;
    String name;
    int age;
    char grade;
    Node next;

    public Node(int r, String n, int a, char g){
        this.rollNo=r;
        this.name=n;
        this.age=a;
        this.grade = g;
        this.next = null;
    }
}