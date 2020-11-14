package com.ptit.level3;

import java.util.Scanner;

//Day con dai nhat cua 3 xau
public class B63 {
    static int[][][] dp = new int[101][101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    for (int k = 1; k <= c; k++) {
                        if (s1.charAt(i - 1) == s2.charAt(j - 1) && s2.charAt(j - 1) == s3.charAt(k - 1)) {
                            dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                        } else {
                            dp[i][j][k] = Math.max(dp[i - 1][j][k], Math.max(dp[i][j - 1][k], dp[i][j][k - 1]));
                        }
                    }
                }
            }
            System.out.println(dp[a][b][c]);
        }
    }
}
