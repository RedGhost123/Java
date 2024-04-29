package Searching.binary_search;

public class Binary_search_Loop {
    static boolean binarySearch(int []arr, int st, int end, int target) {
        int n = arr.length;
        while (st<=end){
            int mid = st + (end-st)/2;
            if ( target == arr[mid]){
                return true;
            } else if (target < arr[mid]) {
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int target = 90;
        System.out.println(binarySearch(arr,0,arr.length-1,target));
    }
}
