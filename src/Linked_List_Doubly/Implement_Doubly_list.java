package Linked_List_Doubly;

import Linked_list.Linked_List_Prctice;

public class Implement_Doubly_list {
    public static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public static class Doubly_List{
        Node head = null;
        Node tail = null;
        int size = 0;
        void InsertAt_head(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
                tail = temp;
            }else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }
        void InsertAt_End(int val){
            Node temp = new Node(val);
            if (head == null){
                head = temp;
            }else {
                tail.next = temp;
                temp.prev = tail;
            }   tail = temp;
            size++;
        }
        void Insert_At_Any(int val, int idx){
            Node temp = new Node(val);
            Node t = head;
            if (idx == 0){
                InsertAt_head(val);
            } else if (idx == size) {
                InsertAt_End(val);
            } else if (idx > size || idx == -1) {
                System.out.println("Input data out of range  ");
                     return;
            }else {
                 for (int i = 0; i < idx-1; i++) {
                     t = t.next;
                     temp.next = t.next;
                 }
                    // t.next = temp.next; =--------- wrong
                     t.next.prev = temp;
                     t.next = temp;
                     temp.prev = t;

            }
            size++;
        }
//        void Display(){
//            Node temp = head;
//            while (temp  != null){
//                System.out.print(temp.data+" ");
//                temp = temp.next;
//            }
//        }
          void Display(){
          Node temp = head;
           while (temp != null){
             System.out.print(temp.data+" ");
             temp = temp.next;
              }
           }
    }
    public static void main(String[] args) {
        Doubly_List dl = new Doubly_List();

        dl.InsertAt_head(4);
        dl.InsertAt_head(5);
        dl.InsertAt_head(6);
        dl.InsertAt_head(7);
        dl.InsertAt_head(8);

        dl.Display();
        dl.InsertAt_End(9);
        System.out.println();
        dl.Display();
        System.out.println();
        System.out.println("Size = "+dl.size);
        dl.Insert_At_Any(4, 3);
        dl.Display();
        System.out.println();
        System.out.println("Head data = "+dl.head.data);
        System.out.println("Tail data = "+dl.tail.data);
        System.out.println("tail prev data = "+dl.tail.prev.data);

    }
}
