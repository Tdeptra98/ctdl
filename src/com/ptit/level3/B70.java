package com.ptit.level3;

import java.util.Scanner;

//Xau con doi xung dai nhat
public class B70 {
    static boolean[][] dp = new boolean[1005][1005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            int res = 1;
            for (int i = 0; i < str.length(); i++) {
                int u = i, v = i;
                while (u >= 0 && v < str.length()){
                    if(str.charAt(u) == str.charAt(v)){
                        res = Math.max(res, v - u + 1);
                        u--;v++;
                    }
                    else break;
                }
            }
            for (int i = 0; i < str.length() - 1; i++) {
                int u = i, v = i + 1;
                while (u >= 0 && v < str.length()){
                    if(str.charAt(u) == str.charAt(v)){
                        res = Math.max(res, v - u + 1);
                        u--;v++;
                    }
                    else break;
                }
            }
            System.out.println(res);
        }
    }
}
