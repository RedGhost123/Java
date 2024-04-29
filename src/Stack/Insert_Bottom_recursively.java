package Stack;

import javax.jnlp.IntegrationService;
import java.util.Stack;

public class Insert_Bottom_recursively {
    public static void Recursively(Stack<Integer> st){
        if (st.size()== 0){
            st.push(6);
            return;
        }
        int top = st.pop();
        Recursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Recursively(st);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        System.out.println(st);
    }
}
