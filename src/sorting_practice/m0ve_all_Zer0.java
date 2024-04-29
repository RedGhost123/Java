package sorting_practice;

public class m0ve_all_Zer0 {
    // Using Bubble Sort ------------------------------------------------
    static void srt(int arr[]){
        int n = arr.length;
        for (int i = 0 ; i < n;i++){
            int min_idx = i;
            for(int j = 0; j < n-i-1;j++){
             if (arr[j] == 0 && arr[j] < arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
              }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,4,5,0,2,0,1};
        srt(arr);
        for (int val: arr) {
            System.out.println(val);
        }
    }
}
