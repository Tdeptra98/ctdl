package com.ptit.level3;

import java.util.Scanner;

//Xau con chung dai nhat
public class B61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            char[] X1 = s1.toCharArray();
            char[] X2 = s2.toCharArray();
            int res = 0;
            int[][] F = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 1; i <= s1.length(); i++) {
                for (int j = 1; j <= s2.length(); j++) {
                    if (X1[i - 1] == X2[j - 1]) F[i][j] = F[i - 1][j - 1] + 1;
                    else F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]);
                    res = Math.max(res, F[i][j]);
                }
            }
            System.out.println(res);
        }
    }
}
