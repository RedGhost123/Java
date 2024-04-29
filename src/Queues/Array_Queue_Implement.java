package Queues;

public class Array_Queue_Implement {
    public static class queue{
        int f = -1;
        int r = -1;
        int [] arr = new int[50];
        int size  = 0;
        public void add(int x){
            if (r== arr.length-1){
                System.out.println("Queue is full");
                return;
            }
            if (f == -1) {
                f = r = 0;
                arr[0] = x;
            } else {
                arr[++r] = x;
            }
            size++;
        }
        public int remove(){
            f++;
            size--;
            return arr[f-1];
        }
        int peek(){
            return arr[f];
        }
        public void display(){
            if (size == 0){
                System.out.println("queue is empty");
            }else {
                for (int i = f; i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
        }
        int size(){
           return size;
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        System.out.println();
        q.display();
        System.out.println();
        System.out.println(q.size);
    }
}
