package Stack;

import java.util.Stack;

public class Practice {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class Linked_Stack{
        int size = 0;
        Node head = null;
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
            }else {
                int x = head.data;
                head = head.next;
                size--;
                return x;

            }
        }
    }
    public static class Array_Stack{
        int [] arr = new int[5];
        int n = arr.length;
        int idx = 0;
        int size = 0;
        void push(int data){
            if (idx == n){
                System.out.println("Memory is full");
                return;
            }else {
                arr[idx] = data;
                idx++;
            }
        }
        int pop(){
            if (idx == 0){
                System.out.println("Memory is empty");
                return -1;
            }else {
                int top = arr[idx-1];
                arr[idx-1] = 0;
                idx--;
                return top;
            }
        }
        void display(){
            if (arr[idx-1]== 0){
                System.out.println("stack is empty");
                return;
            }else {
                for (int i = 0; i <= idx-1;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Array_Stack as = new Array_Stack();
        Linked_Stack ls = new Linked_Stack();
        ls.push(1);
        as.push(2);
        System.out.println(ls.head.data);
        as.display();
    }
}
