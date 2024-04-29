package sorting.insertion_sort;

public class Insertin_srt {
    static void Insertin_srtt(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int j = i;
            while (j > 0 && arr[j] < arr[j-1]){
                int swap = arr[j];
                arr[j] = arr[ j-1];
                arr[j-1] = swap;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {6,4,2,8,1,2};
        Insertin_srtt(arr);
        for (int val : arr){
            System.out.print(val+" ");
        }
    }
}
