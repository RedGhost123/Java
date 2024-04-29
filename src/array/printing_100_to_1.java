package array;

public class printing_100_to_1 {
    static void inverse_loop(int [] arr){
        int n = arr.length;
        for (int i = n; i >= 0; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int [100];
        inverse_loop(arr);
    }
}
