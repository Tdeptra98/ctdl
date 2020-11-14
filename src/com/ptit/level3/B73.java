package com.ptit.level3;

import java.util.Scanner;

//xem phim
public class B73 {
    static int[][] dp = new int[101][25001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n + 5];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (j >= arr[i]) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - arr[i]] + arr[i]);
                } else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[n][W]);
    }
}
