package array;

public class printing_loop {

    static void lop(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;


        lop(arr);
    }
}
