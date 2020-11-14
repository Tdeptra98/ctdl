package com.ptit.level3;

import java.util.Scanner;

//Giai ma
public class B76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            if(str.charAt(0) == '0'){
                System.out.println(0);
                continue;
            }
            int n = str.length();
            int[] dp = new int[n + 5];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = 0;
                if(str.charAt(i - 1) > '0'){
                    dp[i] = dp[i - 1];
                }
                if(str.charAt(i - 2) == '1' || str.charAt(i - 2) == '2' && str.charAt(i - 1) < '7'){
                    dp[i] += dp[i - 2];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
