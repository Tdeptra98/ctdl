package com.ptit.level1;

import java.util.*;

//To hop so co tong bang X
public class B18 {
    static int n, k;
    static int[] a = new int[100];
    static Vector<Vector<Integer>> res = new Vector<>();
    static Vector<Integer> v = new Vector<>();
    static boolean check = true;

    static void solve(int i, int sum, Vector<Integer> v) {
        if (sum > k) {
            return;
        }
        if (sum == k) {

            res.add(v);
            check = false;

            System.out.print("[");
            for (int j = 0; j < res.get(res.size() - 1).size() - 1; j++) {
                System.out.print(res.get(res.size() - 1).get(j) + " ");
            }
            System.out.print(res.get(res.size() - 1).get(res.get(res.size() - 1).size() - 1) + "]");
            return;
        }
        for (int j = i; j <= n; j++) {
            if (sum + a[j] <= k) {
                v.add(a[j]);
                solve(j, sum + a[j], v);
                v.remove(v.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            res = new Vector<>();
            check = true;
            n = sc.nextInt();
            k = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }

            v.clear();
            Vector<Integer> v = new Vector<>();
            solve(1, 0, v);
            if (check == true) {
                System.out.print("-1");
            }
            System.out.println();
        }
    }
}
