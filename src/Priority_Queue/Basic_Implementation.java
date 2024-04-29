package Priority_Queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Basic_Implementation {
    public static class Student{
        int roll_no;
        int marks;
        String name;
        int dob;
    }
    public static class StudentComparator implements Comparator<Student>{

                 //overriding-----------//
      public int compare(Student s1, Student s2){
            if (s1.marks > s2.marks){
                return -1;
            } else if (s2.marks > s1.marks) {
                return 1;
            }else {
                if (s1.roll_no > s2.roll_no){
                    return 1;
                } else if (s2.roll_no > s1.roll_no) {
                    return -1;
                }else {
                    return 0;
                }
            }
      }
    }
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// max order
        pq.add(23);
        pq.add(45);
        pq.add(34);
        pq.add(21);
        pq.add(56);
        System.out.println(pq.peek());
        PriorityQueue <Integer> pq3 = new PriorityQueue<>(pq);
        System.out.println(pq3.peek());

        PriorityQueue<Integer> pq2 = new PriorityQueue<>(); //  min heap
        pq2.add(23);
        pq2.add(45);
        pq2.add(34);
        pq2.add(21);
        pq.add(20);
        System.out.println(pq2.peek());

        PriorityQueue <Student> pqs = new PriorityQueue<>(new StudentComparator());
        Student Aman = new Student();
        Aman.name = "Aman";
        Aman.marks = 89;
        Aman.roll_no = 68;
        Aman.dob = 1999;

        Student niku = new Student();
        niku.name = "vaibhav";
        niku.marks = 99;
        niku.roll_no = 79;
        niku.dob = 2001;

        pqs.add(Aman);
        pqs.add(niku);

        System.out.println(pqs.peek().name);
        System.out.println(pqs.peek().roll_no);
    }
}