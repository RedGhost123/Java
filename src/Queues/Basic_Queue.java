package Queues;

import Stack.Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Basic_Queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
      //  q.poll();
        System.out.println(q);
        System.out.println(q.peek());
        Queue <Integer> q2 = new LinkedList<>();
        for (int i = 0; i< 4;i++) {
            System.out.print(q.peek()+" ");
            q2.add(q.remove());

        }
//        while (q.size()>0){
//            System.out.println(q.peek());
//            q2.add(q.remove());
//        }
        System.out.println();
        while (q2.size()>0){
            System.out.print(q2.peek()+" ");
            q.add(q2.remove());
        }

    }
}
