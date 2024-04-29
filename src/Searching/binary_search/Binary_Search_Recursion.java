package Searching.binary_search;

public class Binary_Search_Recursion {

    static boolean BSrec(int []arr, int st, int end, int target) {
        if (st > end) {
            return false;
        }
            int mid = st + (end - st) / 2;
            if (target == arr[mid]) {
                return true;
            } else if (target < arr[mid]) {
                return BSrec(arr, st, mid - 1, target);
            } else {
                return BSrec(arr, mid + 1, end, target);
            }
         }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target = 5;
        System.out.println(BSrec(arr,0, arr.length-1, target));
    }
}
