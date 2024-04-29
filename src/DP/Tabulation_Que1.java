package DP;

public class Tabulation_Que1 {
    public static int fibb(int idx, int [] dp) {
        if (idx == 0 || idx == 1) return idx;
        if (dp[idx] != -1) return dp[idx];
        return dp[idx] = fibb(idx - 1, dp) + fibb(idx - 2, dp);
    }
    public static void main(String[] args) {
        int n = 10;
       int [] dp = new int[n+1];
//        for (int i = 0; i<= n;i++){
//            dp[i] = -1;
//        }
        dp[2] = 1;
        dp[1] = 1;
        for (int i = 3; i<= n; i++){

            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
