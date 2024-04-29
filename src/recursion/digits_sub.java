package recursion;

public class digits_sub {
    static int SOD(int n){
        if(n >= 0 && n <= 9){
            return n ;
        }
        int smallans = SOD(n/10);
        int ans = smallans + n%10;
        return ans;
 //       return smallans + n % 10;  //  ----- this is short code form:

    }
    public static void main(String[] args) {
        System.out.println(SOD(100));
    }
}
