package Linked_list;

public class Linked_Lst {
    int Counter;
    public static class Node {
        int data;
        Node next;
//        static int count;
        Node(int data) {
            this.data = data;
//            count++;
        }
    }
    public static void recursive_fun(Node head){
            if (head == null)return;
            recursive_fun(head.next);
            System.out.print(head.data+" ");
    }
    public static int Counter(Node head){
        int Count = 0;
        while (head != null){
            Count++;
        }
        return Count;
    }


        public static void main(String[] args) {
          Node a = new Node(6);
          Node b = new Node(7);
          Node c = new Node(8);
          Node d = new Node(9);
          Node e = new Node(10);

            System.out.println(a.next);
            System.out.println(a.data);
            a.next = b;
            System.out.println(a.next);
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println(a.next.next.next.next.data);


            // declaring temp pointer;
            Node temp = a;
            // Using while loop;
            System.out.println("Using while Loop");
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;

            }

            // Using for loop;

//            for (int i = 0; i < 5; i++){
//                System.out.println(temp.data);
//                temp = temp.next;
//            }
//            System.out.println();
//            System.out.println("Using recursion in reverse order printing data");
//            recursive_fun(a);
//            System.out.println();
//            System.out.println("Number of data store = "+Node.count);
            System.out.println(Counter(a));
            }

        }


