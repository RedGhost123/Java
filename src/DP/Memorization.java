package DP;

public class Memorization {
    public static int calls = 0;
    public static int fib(int idx, int [] dp){
        if ( idx == 1 || idx == 0)return idx;
        if (dp[idx] != -1)return dp[idx];
        calls++;
       int result = fib(idx-1, dp)+fib(idx-2, dp);
       dp[idx] = result;
       return result;
    }

    public static void  main(String[] args) {
        int n = 15;
        int [] dp = new int[n+1];
        for (int i = 0; i<=n; i++){
            dp[i] = -1;
        }
        System.out.println(fib(n,dp));
        System.out.println(calls);
    }
}
