package com.ptit.level1;
//Tap hop

import java.util.Scanner;

public class B26 {
    static int n, k, res, s;
    static int[] a = new int[11];

    static void solve(int i) {
        for (int j = a[i - 1] + 1; j <= n - k + i; j++) {
            a[i] = j;
            if (i == k) {
                int sum = 0;
                for (int l = 1; l <= k; l++) {
                    sum += a[l];
                }
                if (sum == s) res++;
            } else solve(i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            n = Integer.parseInt(sc.next());
            k = Integer.parseInt(sc.next());
            s = Integer.parseInt(sc.next());
            res = 0;
            for (int i = 0; i < 10; i++) {
                a[i] = 0;
            }
            if (n == 0 && k == 0 && s == 0) break;
            solve(1);
            System.out.println(res);
        }
    }
}
