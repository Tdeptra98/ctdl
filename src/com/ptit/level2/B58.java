package com.ptit.level2;

import java.util.Scanner;

//Di chuyen trong ma tran
public class B58 {
    static int n, m;
    static int[][] matrix;
    static int[][] matrix2;
    static int[] er = new int[1000000];
    static int[] ec = new int[1000000];
    static int head, tail;

    static int solve() {
        head = 0;
        tail = 0;
        er[0] = 1;
        ec[0] = 1;
        matrix2[1][1] = 1;
        while (head <= tail) {
            int topr = er[head];
            int topc = ec[head];
            int topm = matrix2[topr][topc];
            int step = matrix[topr][topc];
            head++;
            if (topr == n && topc == m) return topm - 1;

            int tempr = topr;
            int tempc = topc + step;
            if (tempr >= 1 && tempr <= n && tempc >= 1 && tempc <= m && matrix2[tempr][tempc] == 0) {
                tail++;
                er[tail] = tempr;
                ec[tail] = tempc;
                matrix2[tempr][tempc] = topm + 1;
            }

            tempr = topr + step;
            tempc = topc;
            if (tempr >= 1 && tempr <= n && tempc >= 1 && tempc <= m && matrix2[tempr][tempc] == 0) {
                tail++;
                er[tail] = tempr;
                ec[tail] = tempc;
                matrix2[tempr][tempc] = topm + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            matrix = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    matrix[i][j] = in.nextInt();
                }
            }
            matrix2 = new int[n + 1][m + 1];
            System.out.println(solve());
        }
    }
}
