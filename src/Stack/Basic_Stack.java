package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Basic_Stack {

    // using recursion to print data;

     public static void Display_resursively(Stack<Integer> st){
         if (st.size()== 0)return;
         int top = st.pop();
         System.out.print(top+" ");
         Display_resursively(st);
         st.push(top);
         System.out.print(top+" ");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
          Stack<Integer>  st = new Stack<>();
//        int n;
//        System.out.println("enter the size of element");
//        n = sc.nextInt();
//        System.out.println("enter the element");
//        for (int i = 1; i <= n; i++){
//
//            st.push(sc.nextInt());
//        }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println("peek = "+st.peek());
        st.pop();
        System.out.println(st);
        System.out.println("size = "+st.size());
        System.out.println("peek after pop = "+st.peek());
//        while (st.size()>2){
//            st.pop();
//        }
        System.out.println(st);
        Display_resursively(st);
    }
}
