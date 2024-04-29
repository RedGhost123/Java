package recursion_array;

public class findArray_Element {
    static boolean findelement(int arr[],int target, int idx){
        if (arr[idx] >= arr.length){
            return false;
        }
        if (arr[idx] == target) return true;
       return findelement(arr,target,0);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,8};
        findelement(arr,4,0);
    }
}
