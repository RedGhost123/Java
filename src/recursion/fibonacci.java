package recursion;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class fibonacci {/// fb of n = n-1 + n-2
   static int calls;
    static int fib(int n){

        if (n == 1 || n == 0){
            return n;
        }

//        int prev = fib(n-1);  // this code is long
//        int pre_prev = fib(n-2);
//        int ans = (prev + pre_prev);
//        return ans;
        calls++;
       return  fib(n-1)+ fib(n-2);  // this is small code
    }
    public static void main(String[] args) {

        System.out.println("Fibonnaci of n is : "+fib(3));
        System.out.println("number of call : "+calls);

    }

}
