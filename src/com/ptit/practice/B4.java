package com.ptit.practice;

import java.util.Scanner;

//Tap quan su
public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[k+5];
            int[] d = new int[100];
            for (int i = 1; i <= k; i++) {
                arr[i] = sc.nextInt();
                d[arr[i]] = 1;
            }
            int i = k;
            while(i > 0 && arr[i] == n - k + i){
                i--;
            }
            if(i <= 0) System.out.print(k);
            else {
                arr[i] += 1;
                for (int j = i + 1; j <= k; j++) {
                    arr[j] = arr[j - 1] + 1;
                }
                for (int j = 1; j <= k; j++) {
                    d[arr[j]] = 0;
                }
                int res = 0;
                for (int j = 1; j <= 40; j++) {
                    if(d[j] == 1) res++;
                }
                System.out.print(res);
            }
            System.out.println();
        }
    }
}
