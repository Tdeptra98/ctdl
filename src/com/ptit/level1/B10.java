package com.ptit.level1;

import java.util.Scanner;

//hoan vi nguoc
public class B10 {
    static int[] a = new int[100];
    static int n;
    static boolean[] check = new boolean[100];

    static void solve(int i){
        for (int j = n; j > 0; j--) {
            if(!check[j]){
                a[i] = j;
                check[j] = true;
                if(i == n){
                    for (int k = 1; k <= n; k++) {
                        System.out.print(a[k]);
                    }
                    System.out.print(" ");
                }
                else solve(i + 1);
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            solve(1);
            System.out.println();
        }
    }
}