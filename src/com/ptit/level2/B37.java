package com.ptit.level2;

import java.util.Scanner;

//Day xau Fibonacci
public class B37 {

    static Character solve(int n, long k, long[] arr) {
        if (n == 1) return 'A';
        if (n == 2) return 'B';
        if (k <= arr[n - 2]) return solve(n - 2, k, arr);
        return solve(n - 1, k - arr[n - 2], arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long[] arr = new long[100];
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            arr[1] = 1;
            arr[2] = 1;
            for (int i = 3; i <= n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(solve(n, k, arr));
        }
    }
}
