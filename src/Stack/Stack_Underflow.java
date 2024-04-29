package Stack;

import java.util.Stack;

public class Stack_Underflow  {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.peek();  // thrown stackunderflow error
    }
}
