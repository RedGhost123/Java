package sorting.bubble_sort;

public class bubblesrt_practice {
    static void Bubble(int [] arr){
        int n = arr.length;
        for (int i = 0; i< n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j]>arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,8,1,2,5,3};
        Bubble(arr);
        for (int i : arr){
            System.out.println(i);
        }
    }
}
