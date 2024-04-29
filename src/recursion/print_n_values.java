package recursion;

import java.util.Scanner;

public class print_n_values {
    static int print_val(int n){
        if (n == 0) return 0;
        if (n % 2 == 0){
          return print_val(n-1) - n;
        }else {
            return print_val(n-1) +n;
        }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print_val(n));
    }
}
