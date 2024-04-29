package vivek;

import sun.security.x509.IPAddressName;

public class vivek {
    static void Ip(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        Ip(n - 1);
        System.out.println(n+" ");
    }
         public static void main (String[]args){
            int n = 100;
            Ip(n);

        }
    }
