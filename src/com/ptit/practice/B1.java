package com.ptit.practice;

import java.util.Scanner;

//Gray 1
public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = 1;
            for (int i = 1; i <= n; i++) {
                k *= 2;
            }
            String[] str = new String[k + 5];
            str[1] = "0";
            str[2] = "1";
            if(n > 1){
                int temp = 2;
                for (int i = 2; i <= n; i++) {
                    int  l = 1;
                    for (int j = 1; j <= i; j++) {
                        l *= 2;
                    }
                    for (int j = 1; j <= temp; j++) {
                        str[l - j + 1] = "1" + str[j];
                        str[j] = "0" + str[j];
                    }
                    temp = l;
                }
            }
            for (int i = 1; i <= k; i++) {
                System.out.print(str[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
