package com.ptit.level1;

import java.util.Scanner;

//Doi cho cac chu so
public class B17 {
    static int k;
    static String str;

    static String swap(int x, int y){
        StringBuilder sb = new StringBuilder(str);
        char a = sb.charAt(x);
        char b = sb.charAt(y);
        sb.setCharAt(x, b);
        sb.setCharAt(y, a);
        return new String(sb);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            k = sc.nextInt();
            str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                char Max = str.charAt(str.length() - 1);
                int vt = str.length() - 1;
                for (int j = str.length() - 1; j > i && k > 0; j--) {
                    if (Max < str.charAt(j)) {
                        Max = str.charAt(j);
                        vt = j;
                    }
                }
                if (Max > str.charAt(i) && k > 0) {
                    str = swap(i, vt);
                    k--;
                }
            }
            System.out.println(str);

        }
    }
}
