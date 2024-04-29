package sorting.selection_sort;

public class first_srt {
    static void Selectin_srt(int arr[]){
        int n = arr.length;
        for (int i = 0; i< n-1; i++){
            int min_idx = i;
            for (int j = i+1; j<n;j++){
                if (arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            // swap current element and minimum element
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

    }
    public static void main(String[] args) {
        int arr[] = {10,9,7,5,3};
        Selectin_srt(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+ " ");
        }

    }
}
