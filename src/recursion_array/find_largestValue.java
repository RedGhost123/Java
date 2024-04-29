package recursion_array;

public class find_largestValue {
    static int Bigvalue(int [] arr, int idx){
        if (idx == arr.length-1){
            return arr[idx];
        }
        int  smallans = Bigvalue(arr,idx-1);
        return Math.max(smallans,arr[idx]);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,3,4,4,5};
        Bigvalue(arr,0);
        System.out.println(Bigvalue(arr,0));
    }
}
