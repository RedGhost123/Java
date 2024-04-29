package Stack;

public class Stack_LinkedLst_Impl {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linked_stack{
        Node head = null;
        int size = 0;
        void push(int data){
            Node temp = new Node(data);
            if (head == null){
                head = temp;
            }else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        int pop(){
            if (head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

    }

    public static void main(String[] args) {
        Linked_stack ls = new Linked_stack();
        ls.push(4);
        ls.push(5);

        System.out.println(ls.head.data);
        ls.pop();
        System.out.println(ls.head.data);
    }
}
