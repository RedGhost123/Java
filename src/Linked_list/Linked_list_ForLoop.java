package Linked_list;

public class Linked_list_ForLoop {
    public static class Node{
        int data;
        Node next;
        static int count;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);

        a.next = b;
        b.next = c;

        Node temp = a;
        for (int i = 0; i<3; i++){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Number of data"+" = "+Node.count);
    }
}
