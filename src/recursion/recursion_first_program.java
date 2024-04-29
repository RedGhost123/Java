package recursion;

public class recursion_first_program {
   static void IP(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }

        IP(n-1);
       System.out.print(n + ", ");

    }

    public static void main(String[] args) {
        int n = 100;
        IP(n);
    }
}
