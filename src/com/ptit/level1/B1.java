package com.ptit.level1;

import java.util.Scanner;

//Fibonacci number

public class B1 {

    static long fib(int n) {
        long f[] = new long[n + 2];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(fib(n));
        }
    }
}
