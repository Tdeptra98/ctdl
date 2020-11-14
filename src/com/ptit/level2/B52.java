package com.ptit.level2;

import java.util.*;

//So BDN 1
public class B52 {
    static String n;
    static int cnt;

    static boolean check(String a, String b) {
        if (a.length() < b.length()) return true;
        if (a.length() > b.length()) return false;
        return a.compareTo(b) <= 0;
    }

    static void Try(String str) {
        if (check(str, n)) {
            cnt++;
            Try(str + "0");
            Try(str + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            n = sc.nextLine();
            cnt = 0;

            Try("1");
            System.out.println(cnt);
        }
    }
}
