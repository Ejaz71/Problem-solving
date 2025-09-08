import java.util.Scanner;

public class LL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        //addNode (this, 1); // can i use addNode here?
    }

    public static void addNode (Node head,int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node addNodeFirst (Node head, int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }

    public static int listLength(Node head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }


}

class Main {
    public static void main(String[] args) {
        LL.Node head = new LL.Node(10);
        LL.addNode(head,20);
        head = LL.addNodeFirst(head, 9);
        LL.printLL(head);
        System.out.println(LL.listLength(head));
    }
}
