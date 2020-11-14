package com.ptit.practice;

import java.util.Scanner;

//Mua luong thuc
public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, s, m;
            n = Integer.parseInt(sc.next());
            s = Integer.parseInt(sc.next());
            m = Integer.parseInt(sc.next());
            if (s * m > (s - s / 7) * n) System.out.print(-1);
            else {
                for (int i = 1; i <= s - s / 7; i++) {
                    if (n * i >= s * m) {
                        System.out.print(i);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
