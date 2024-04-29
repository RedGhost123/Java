package array;

public class printing_1_to_100 {
    static void loops(int arr[]){
        int n  = arr.length;
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[100];
        loops(arr);
    }
}
