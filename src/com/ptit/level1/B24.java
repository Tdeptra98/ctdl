package com.ptit.level1;
//Phan tich so nguyen

import java.util.Scanner;

public class B24 {
    static int n, s;
    static int[] arr = new int[100];
    static boolean check;

    static void generate() {
        int i = s;
        while (i > 0 && arr[i] == 1) i--;
        if (i == 0) check = true;
        if (i > 0) {
            arr[i] -= 1;
            int d = s - i + 1;
            s = i;
            if (d / arr[i] > 0) {
                for (int j = i; j <= i + d / arr[i]; j++) {
                    arr[j] = arr[i];
                }
                s = s + d / arr[i];
            }
            if (d % arr[i] > 0) {
                s = s + 1;
                arr[s] = d % arr[i];
            }
            String str = "";
            for (int m = 1; m <= s; m++) {
                str += String.valueOf(arr[m]) + " ";
            }
            System.out.print("(" + str.trim() + ")" + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            s = 1;
            arr[s] = n;
            check = false;
            System.out.print("(" + arr[1] + ")" + " ");
            while (!check) {
                generate();
            }
            System.out.println();
        }

    }
}
