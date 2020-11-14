package com.ptit.level3;

import java.util.Scanner;

//Day con lap lai dai nhat
public class B62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String str = sc.nextLine();
            int[][] dp = new int[n + 5][n + 5];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
            System.out.println(dp[n][n]);
        }
    }
}
