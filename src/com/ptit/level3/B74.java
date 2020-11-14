package com.ptit.level3;

import java.util.Scanner;

//Cai tui
public class B74 {

    static int knapSack(int[] v, int[] val, int n, int V) {
        int[][] K = new int[n + 1][V + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= V; j++) {
                if (i == 0 || j == 0) K[i][j] = 0;
                else if (j < v[i]) {
                    K[i][j] = K[i - 1][j];
                } else {
                    K[i][j] = Math.max(K[i - 1][j], val[i] + K[i - 1][j - v[i]]);
                }
            }
        }
        return K[n][V];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int V = sc.nextInt();
            int[] a = new int[1005];
            int[] c = new int[1005];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                c[i] = sc.nextInt();
            }
            System.out.println(knapSack(a, c, n, V));
        }
    }
}
