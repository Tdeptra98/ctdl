package com.ptit.level1;

//Xau nhi phan ke tiep

import java.util.Scanner;

public class B8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String x = sc.next();
            int n = x.length() - 1;
            while(x.charAt(n) == '1' && n > 0){
                n--;
            }
            String result = "";
            if (n > 0) {
                result = x.substring(0, n);
                result = result + "1";
                for (int i = n; i < x.length() - 1; i++) {
                    result += "0";
                }
            } else {
                for (int i = 0; i < x.length(); i++) {
                    result += "0";
                }
            }
            System.out.println(result);
        }
    }
}
