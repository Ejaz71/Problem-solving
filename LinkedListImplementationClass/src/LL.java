import java.util.Scanner;

public class LL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
        Node() {};
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

    public static Node removeNthFromEnd(Node head, int n) {
        int length = listLength(head);
        if(length == 1) return null;
        int index = length - n, i = 1;
        if(index == 0) return head.next;
        Node temp = head;
        while(i < index) {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        return head;
    }

    public static Node reverseList(Node head) {
        if (head == null) return null;
        Node prev, curr, next;
        prev = null;
        curr = head;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node reverseListRecursively(Node head) {
        if(head == null || head.next == null) return head;
        Node newHead = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node merged = new Node();
        while ( list1 != null || list2 != null) {
            if (list1 == null) {
                addNode(merged, list2.data);
                //System.out.print(list2.data + " ");
                list2 = list2.next;

            } else if (list2 == null) {
                addNode(merged, list1.data);
                list1 = list1.next;
            } else {
                if (list1.data < list2.data) {
                    addNode(merged, list1.data);
                    //System.out.print(list1.data + " ");
                    list1 = list1.next;
                } else {
                    addNode(merged, list2.data);
                    //System.out.print(list2.data + " ");
                    list2 = list2.next;
                }
            }
        }
        return merged.next;
    }

    public static Node mergeTwoListsRecursively(Node list1, Node list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;
        else if (list1.data < list2.data) {
            list1.next = mergeTwoListsRecursively(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoListsRecursively(list2.next, list1);
            return list2;
        }
    }
}

class Main {
    public static void main(String[] args) {
        LL.Node head = new LL.Node(10);
        LL.addNode(head,20);
        head = LL.addNodeFirst(head, 9);
        LL.addNode(head, 30);
        LL.addNode(head, 40);
        LL.addNode(head, 50);
        LL.addNode(head, 60);
        LL.addNode(head, 65);
        LL.addNode(head, 67);
        LL.addNode(head, 70);
        LL.addNode(head, 75);
        LL.addNode(head, 80);
        LL.addNode(head, 100);
        LL.printLL(head);
//        head = LL.reverseList(head);
//        LL.printLL(head);
//        head = LL.reverseListRecursively(head);
//        LL.printLL(head);

        LL.Node head2 = new LL.Node(4);
        LL.addNode(head2,5);
        LL.addNode(head2,15);
        LL.addNode(head2,25);
        LL.addNode(head2,85);
        LL.addNode(head2,95);
        LL.printLL(head2);

        LL.Node head3 = null;
//        head2 = LL.reverseList(head2);
//        LL.printLL(head2);
//        //System.out.println(LL.listLength(head));
//
//        LL.Node headAfterRemoval = LL.removeNthFromEnd(head, 7);
//        LL.printLL(headAfterRemoval);
        LL.Node mergedList = LL.mergeTwoListsRecursively(head, head2);
        LL.printLL(mergedList);


    }
}
