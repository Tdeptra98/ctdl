package com.ptit.practice;

import java.util.Scanner;

//Xau nhi phan co k bit 1
public class B3 {
    static int n, k;
    static int[] a = new int[100];

    static void solve(int i){
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if(i == n){
                int count = 0;
                for (int l = 1; l <= n; l++) {
                    if(a[l] == 1) count++;
                }
                if(count == k){
                    for (int l = 1; l <= n; l++) {
                        System.out.print(a[l]);
                    }
                    System.out.println();
                }
            }
            else solve(i + 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            solve(1);
        }
    }
}
