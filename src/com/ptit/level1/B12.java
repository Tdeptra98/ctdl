package com.ptit.level1;

import java.util.Scanner;

//To hop tiep theo
public class B12 {
    static int n, k, check, ans;
    static int[] input = new int[50];
    static int[] now = new int[50];
    static int[] past = new int[50];

    static void solve(int x, int y) {
        if (check == 2) return;
        for (int i = 1; i <= n; i++) {
            if (check == 2) return;
            if (past[i] == 0 && i > y) {
                now[x] = i;
                past[i] = 1;
                if (x == k) {
                    if (check == 0) {
                        check = 1;
                        for (int j = 1; j <= k; j++) {
                            if (input[j] != now[j]) {
                                check = 0;
                                break;
                            }
                        }
                    } else {
                        int kk = 0;
                        for (int j = 1; j <= k; j++) {
                            for (int l = 1; l <= k; l++) {
                                if (input[j] == now[l]) {
                                    kk++;
                                    break;
                                }
                            }
                        }
                        ans = k - kk;
                        check = 2;
                    }
                }else{
                    solve(x + 1, i);
                }
                past[i] = 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            k = sc.nextInt();
            for (int i = 1; i < 50; i++) {
                input[i] = 0;
                now[i] = 0;
                past[i] = 0;
            }
            for (int i = 1; i <= k; i++) {
                input[i] = sc.nextInt();
            }
            check = 0;
            ans = 0;
            solve(1, 0);
            if (ans == 0) {
                ans = k;
            }
            System.out.println(ans);
        }
    }
}
