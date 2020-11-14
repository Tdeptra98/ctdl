package com.ptit.level1;

import java.util.Scanner;

//Sap xep n quan hau
public class B21 {
    static int n, res;
    static boolean cot[] = new boolean[50];
    static boolean xuoi[] = new boolean[50];
    static boolean nguoc[] = new boolean[50];

    static void solve(int i) {

        for (int j = 1; j <= n; j++) {
            if (cot[j] && xuoi[n + i - j] && nguoc[i + j]) {
                cot[j] = false;
                xuoi[n + i - j] = false;
                nguoc[i + j] = false;
                if (i == n) {
                    res++;
                }
                else solve(i + 1);
                cot[j] = true;
                xuoi[n + i - j] = true;
                nguoc[i + j] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            n = sc.nextInt();
            res = 0;
            for (int i = 1; i <= n; i++) {
                cot[i] = true;
            }
            for (int j = 1; j <= 2 * n; j++) {
                xuoi[j] = true;
                nguoc[j] = true;
            }
            solve(1);
            System.out.println(res);
        }

    }
}
