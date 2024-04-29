package DP;

public class Memoization_Que_2 {
    static int calls;
    public static int Robber(int [] arr, int ind, int []dp){
        int n = arr.length;
        if (ind == n-1)return arr[ind];
        if (ind >= arr.length) return 0;
        if (dp[ind] != -1){
            return dp[ind];
        }
        calls++;
        int pik = arr[ind]+ Robber(arr, ind+2,dp);
        int notpik = Robber(arr,ind+1,dp);
        return dp[ind] =  Math.max(pik,notpik);
    }
    public static void main(String[] args) {
        int n = 10;

        int [] arr = new int[n];
        arr[0] = 2;
        arr[1] = 7;
        arr[2] = 9;
        arr[3] = 3;
        arr[4] = 1;
        arr[5] = 2;
        arr[6] = 7;
        arr[7] = 9;
        arr[8] = 3;
        arr[9] = 1;

        int [] dp = new int[n];
        for (int i = 0; i< n;i++){
            dp[i] = -1;
        }
        System.out.println(Robber(arr,0,dp));
        System.out.println(calls);
    }
}
