package com.ptit.level3;

import java.util.Scanner;

//So buoc it nhat
public class B66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int lenght = sc.nextInt();
            int[] arr = new int[lenght + 5];
            int[] dp = new int[lenght + 5];
            int res = 0;

            for (int i = 1; i <= lenght; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 1; i <= lenght; i++) {
                dp[i] = 1;
                for (int j = 1; j < i; j++) {
                    if (arr[i] >= arr[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                res = Math.max(res, dp[i]);
            }
            System.out.println(lenght - res);
        }
    }
}
