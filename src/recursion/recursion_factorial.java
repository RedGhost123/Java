package recursion;

public class recursion_factorial {
    static int factoral(int n){
        if (n == 1){
            return 1;
        }
        int a = factoral(n-1);
        int ans = n * a;
        return ans;


    }
    public static void main(String[] args) {
        System.out.println(factoral(6));
    }
}


