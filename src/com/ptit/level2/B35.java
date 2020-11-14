package com.ptit.level2;

import java.util.Scanner;

//Luy thua
public class B35 {
    static long mod = 1000000007;
    static int n, k;

    static long solve(int n, int k) {
        if (k == 0) return 1;
        long x = solve(n, k / 2) % mod;
        if (k % 2 == 0) return (x % mod * x % mod) % mod;
        return (n % mod * x % mod * x % mod) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = Integer.parseInt(sc.next());
            k = Integer.parseInt(sc.next());
            System.out.println(solve(n, k));
        }
    }
}
