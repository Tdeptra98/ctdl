package com.ptit.level3;

import java.util.Scanner;

//Tong lon nhat cua day con tang dan
public class B65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n + 5];
            long res = 0;
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            long[] dp = new long[1005];
            for (int i = 1; i <= n; i++) {
                dp[i] = arr[i];
                for (int j = 1; j < i; j++) {
                    if (arr[i] > arr[j]) dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(res);
        }
    }
}
