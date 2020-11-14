package com.ptit.level1;

import java.util.Scanner;

//Sap xep quan hau 2
public class B22 {
    static int n, res;
    static int[][] matrix = new int[10][10];
    static boolean cot[] = new boolean[50];
    static boolean xuoi[] = new boolean[50];
    static boolean nguoc[] = new boolean[50];
    static int[] a = new int[11];

    static void solve(int i) {
        for (int j = 1; j <= n; j++) {
            if (cot[j] && xuoi[n + i - j] && nguoc[i + j]) {
                a[i] = j;
                cot[j] = false;
                xuoi[n + i - j] = false;
                nguoc[i + j] = false;
                if(i == n){
                    int ans = 0;
                    for (int k = 1; k <= 8; k++) {
                        ans += matrix[k][a[k]];
                    }
                    res = Math.max(res, ans);
                }
                solve(i + 1);
                cot[j] = true;
                xuoi[n + i - j] = true;
                nguoc[i + j] = true;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = 8;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            for (int h = 1; h <= n; h++) {
                cot[h] = true;
            }
            for (int i = 1; i <= 2 * n; i++) {
                xuoi[i] = true;
                nguoc[i] = true;
            }
            res = 0;
            solve(1);
            System.out.println(res);
        }
    }
}
