package Queues;

public class Linked_List_Que_Impl {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linked_Que{
        int size = 0;
        Node head = null;
        Node tail = null;
        void add(int data){
            Node temp = new Node(data);
            if (size == 0){
                head = tail = temp;
            }else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        int poll() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int x = head.data;
                head = head.next;
                size--;
                return x;
            }
        }
        int peek(){
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return head.data;
            }
        }
        int Size(){
            return size;
        }
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        boolean isempty(){
            if (size == 0){
                return true;
            }else {
                return false;
            }
        }

    }
    public static void main(String[] args) {
        Linked_Que lq = new Linked_Que();
        lq.add(1);
        lq.add(2);
        lq.add(3);
        lq.add(4);
        lq.add(5);
        lq.display();
        System.out.println();
        System.out.println("Size = "+lq.Size());
        System.out.println("Peek = "+lq.peek());
        lq.poll();
        lq.display();
        System.out.println();
        System.out.println("Size = "+lq.Size());
        System.out.println(lq.isempty());


    }
}
