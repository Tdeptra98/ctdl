package com.ptit.level2;

import java.util.Scanner;

//Gap doi day so
public class B36 {
    static long Mul(int n) {
        if (n == 0) return 1;
        if (n == 1) return 2;
        long x = Mul(n / 2);
        if (n % 2 == 0) return x * x;
        return 2 * x * x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            //long len = (long) Math.pow(2, n - 1);
            long len = Mul(n) / 2;
            while (true) {
                if (len == k) {
                    System.out.print(n);
                    break;
                }
                if (n == 1) {
                    System.out.print(1);
                    break;
                }
                if (k > len) {
                    k = len - (k - len);
                }
                n--;
                len = len / 2;
            }
            System.out.println();
        }
    }
}
