package sorting.bubble_sort;
import java.util.Scanner;

public class Bubblesort {

    static void bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
            if (flag == false) {
                return;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,1,2};
        bubblesort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

