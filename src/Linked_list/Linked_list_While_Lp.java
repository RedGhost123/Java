package Linked_list;

public class Linked_list_While_Lp {
    public static class Node{
        int data;
        Node next;
        static int cnt;
        Node(int data){
            this.data = data;
            cnt++;
        }
    }



    public static void main(String[] args) {
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);

        a.next = b;
        b.next = c;

        Node temp = a;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("number of data"+ Node.cnt);

    }
}
