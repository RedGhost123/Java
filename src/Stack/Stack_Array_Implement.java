package Stack;
public class Stack_Array_Implement {
    public static class Stack{
        private int [] arr = new int[3];
        private int idx = 0;
        void push(int x){
            if (arr.length == size()){
                System.out.println("stack is full need more space to add next element.");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if (idx == 0){
                System.out.println("empty array");
                return -1;
            }else {
               return arr[idx-1];
            }
        }
        int pop(){
            if (idx == 0){
                System.out.println("Stack is empty");
                return -1;
            }else {
                int top = arr[idx-1];
                arr[idx-1] = 0;
                idx--;
                return top;
            }
        }
        boolean isEmpty(){
            if (size()==0){
                return true;
            }else {
                return false;
            }
        }
        boolean isfull(){
            if (arr.length == size()){
                return true;
            }else {
                return false;
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
        int size(){
            return idx;
        }

    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display();
        st.push(5);
        st.display();
        st.push(6);
        st.display();
        st.push(7);
        st.display();
        System.out.println("Size = "+st.size());
        st.pop();
        System.out.println("Size = "+st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.isfull());
    }
}
