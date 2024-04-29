package recursion_array;

public class sum_Of_Element {
    static int ElementSum(int arr[], int idx){

        if( idx == arr.length){
            return 0;
        }
        int smallans =  ElementSum(arr,idx+1);
        return smallans + arr[idx];
    }

    public static void main(String[] args) {
        int arr [] = {2,3,5,20,1};
        System.out.println( ElementSum(arr,0));
    }
}
