package Stack;

import java.util.Stack;

public class Insert_At_Bottom {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        System.out.println(s1);
        Stack<Integer> s2 = new Stack<>();
        while (s1.size()>0){
            s2.push(s1.pop());
        }
        System.out.println(s1);
        System.out.println(s2);
        s1.push(0);
        while (s2.size()>0){
            s1.push(s2.pop());
        }
        System.out.println(s1);
        System.out.println(s2);


    }
}
