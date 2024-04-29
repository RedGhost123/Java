package Linked_list;

public class Linked_List_Recursivily {
    static void recursively( Node temp){
        if ( temp == null)return;
        System.out.print(temp.data+" ");
        recursively(temp.next);
    }
    public static class Node{
        int data;
        Node next;
        static int count;
        Node(int data){
            this.data = data;
            count++;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        Node b = new Node(8);
        Node c = new Node(9);

        a.next = b;
        b.next = c;

        System.out.println("number of data =  "+Node.count);
        System.out.println();
        recursively(a);
    }
}
