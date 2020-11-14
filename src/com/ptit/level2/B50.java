package com.ptit.level2;

import java.util.Scanner;

//Bieu thuc tang giam
public class B50 {
    public static int n;
    public static int[] arr;
    public static String str;

    static boolean check() {
        for (int l = 0; l < n - 1; l++) {
            if (str.charAt(l) == 'D' && arr[l] < arr[l + 1]) return false;
            if (str.charAt(l) == 'I' && arr[l] > arr[l + 1]) return false;
        }
        return true;
    }

    static long convert() {
        long res = 0;
        for (int l = 0; l < n; l++) {
            res = (long) res * 10 + arr[l];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            str = sc.next();
            n = str.length() + 1;
            arr = new int[10];
            int i;
            for (i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            long res;
            if (check()) res = convert();
            else res = 999999999;
            for (i = n - 1; i > 0; i--) {
                if (arr[i] > arr[i - 1]) {
                    int j;
                    for (j = n - 1; j >= i; j--) {
                        if (arr[j] > arr[i - 1]) {
                            int tg = arr[j];
                            arr[j] = arr[i - 1];
                            arr[i - 1] = tg;
                            break;
                        }
                    }
                    for (j = n - 1; j > ((n - 1 + i) / 2); j--) {
                        int tg = arr[i + n - 1 - j];
                        arr[i + n - 1 - j] = arr[j];
                        arr[j] = tg;
                    }
                    if (check()) {
                        if (res > convert()) res = convert();
                    }
                    i = n;
                }
            }
            System.out.println(res);
        }
    }
}
