package Linked_list;

public class Linked_List_Prctice {
    public static class Node {
        int data;
        Node next;
        static int count;
        Node(int data) {
             this.data = data;
             count++;
        }
    }
    public static class Linked_List{
        Node head = null;
        Node tail = null;
        int size = 0;
        void Insert_At_Head(int val){
            Node temp = new Node(val);
            if (head == null){
                tail = temp;
                temp.next = null;
            }else {
                temp.next = head;
            }
            head = temp;
            size++;
        }
        void Insert_At_Tail(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }else {
               tail.next = temp;
            }
            tail = temp;
            temp.next =  null;
            size++;
        }
        void Insert_At_Any(int idx, int val){
            Node temp = new Node(val);
            Node t = head;
            if (idx == 0 || head == null){
               Insert_At_Head(val);
            }
            else if (idx == size){
                Insert_At_Tail(val);
            }else {
                for (int i = 0; i < idx - 1; i++) {
                    t = t.next;
                }
                temp.next = t.next;
                t.next = temp;
            }
            size++;
        }
         int getAt(int idx){
            Node temp = head;
            for (int i = 0; i < idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.Insert_At_Tail(3);
        ll.Insert_At_Tail(4);
        ll.Insert_At_Tail(5);
        ll.Insert_At_Head(6);
        ll.Insert_At_Any(4,76);
        ll.display();
        System.out.println();
        System.out.println("Head value = "+ll.head.data);
        System.out.println("Tail value = "+ll.tail.data);
        System.out.println();
        System.out.println("Size = "+Node.count);
        System.out.println("at idx = " +ll.getAt(0));
        ll.display();
    }
}
