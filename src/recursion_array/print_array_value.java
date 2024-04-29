package recursion_array;

public class print_array_value {
    static void printArray(int [] arr, int idp){
        if (idp == arr.length){
            return;
        }
        System.out.println(arr[idp]);
        printArray(arr, idp+1);
    }

    public static void main(String[] args) {
        int [] arr = {3,4,5,8,9,6,7};
        printArray(arr,0);
    }
}
