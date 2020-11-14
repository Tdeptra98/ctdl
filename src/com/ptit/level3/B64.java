package com.ptit.level3;

import java.util.Scanner;

//Day con tang dai nhat
public class B64 {
    public static void main(String[] args) {
        int res = 0;
        int[] arr = new int[1005];
        int[] dp = new int[1005];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            res = Math.max(res, dp[i]);
        }
        System.out.println(res);
    }
}
