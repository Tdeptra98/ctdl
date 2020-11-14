package com.ptit.level3;

import java.util.Scanner;

//Con ech
public class B67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t -- > 0){
            int n = sc.nextInt();
            long[] dp = new long[105];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            for (int i = 4; i <= 100; i++) {
                dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }
            System.out.println(dp[n]);
        }
    }
}
