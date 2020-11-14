package com.ptit.level3;

import java.util.Scanner;

//To hop C(n, k)
public class B68 {
    static long mod = 1000000007;
    static long[][] dp = new long[1005][1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            for (int i = 0; i <= 1000; i++) {
                for (int j = 0; j <= i; j++) {
                    if(i == j || j == 0) dp[i][j] = 1;
                    else dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    dp[i][j] %= mod;
                }
            }
            System.out.println(dp[n][k]);
        }

    }
}
