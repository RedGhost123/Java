package Linked_List_Doubly;

public class Doubly_List_Recursivily {
    private static Node te;

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }
    static void recursivily(Node head){
        if (head == null)return;
        System.out.print("recursively = " +head.data+" ");
        recursivily(head.prev);
    }
    static void display(Node temp){
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;

        a.prev = null;
        b.prev = a;
        c.prev = b;
        d.prev = c;
        d.next = null;
        System.out.print("Using display function = ");
        display(d);
        System.out.println();
        recursivily(a);
    }
}
