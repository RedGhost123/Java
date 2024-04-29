package recursion;

public class p_square_q {
 static int pow(int p, int q){
     if (q == 0) return 1;
     return p * pow(p,q-1);
 }
    public static void main(String[] args) {
        System.out.println(pow(3,4));
    }
}
