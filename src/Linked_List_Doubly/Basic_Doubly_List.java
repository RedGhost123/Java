package Linked_List_Doubly;

public class Basic_Doubly_List {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(5);
        Node d = new Node(6);
        Node e = new Node(7);

        a.next = b;
        a.prev = null;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.prev = d;
        e.next = null;

        System.out.println(" data of b.prev = "+b.prev.data);
        System.out.println(" data of b.next = "+b.next.data);
        Node temp_reverse = e;
        System.out.print("Data in reverse order = ");
        while (temp_reverse != null){
            System.out.print(temp_reverse.data+" ");
            temp_reverse = temp_reverse.prev;
        }
        System.out.println();
        Node temp = a;
        System.out.print("Data in normal order = ");
        while (temp != null){
            System.out.print( temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

