package recursion;

public class p_Square_q_scnd_method {
    static int pow(int p, int q){
        if ( q == 0){
            return 1;
        }
        int evenans = pow(p,q/2);
        if (q % 2 == 0){
            return evenans * evenans;
        }else {
            return p * ( evenans * evenans );
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(3,3));
    }
}
