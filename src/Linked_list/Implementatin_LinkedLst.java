package Linked_list;

public class Implementatin_LinkedLst {

       public static class Node {
       int data;
       Node next;
       Node(int data){
           this.data = data;
          }
   }
   public static class Linked_List{
           Node head = null;
           Node tail = null;
           void Insert_At_End(int val){
           Node temp = new Node(val);
           if (head == null){
               head = temp;
           }else {
               tail.next = temp;
           }
           tail = temp;
           }
           void Insert_At_Head(int val){
               Node temp = new Node( val);
               if (head == null){
                   tail = temp;
               }else {
                   temp.next = head;
               }
               head = temp;
           }
           void Insert_At_Idx(int idx , int val){
               Node temp = new Node(val);
           }
       void display(){
             Node temp = head;
               while (temp != null){
                   System.out.print(temp.data+" ");
                   temp = temp.next;
               }
           System.out.println();
       }
   }

    public static void main(String[] args) {
        Linked_List ll = new Linked_List();
        ll.Insert_At_Head(5);
        ll.display();
        ll.Insert_At_End(6);
        ll.display();
        ll.Insert_At_Head(10);
        ll.display();
     }
   }
