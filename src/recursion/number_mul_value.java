package recursion;

public class number_mul_value {
    static void num_mul(int x, int y){
        if ( y== 0 || y == 1){
            System.out.println(x
            );
            return ;
        }
       num_mul(x,y-1 );
        System.out.println(x*y);

    }

    public static void main(String[] args) {
       num_mul(5,0);
    }
}
