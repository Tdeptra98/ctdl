package com.ptit.level2;

import java.util.Scanner;

//Dao tu
public class B39 {

    static String reverse(String str){
        StringBuilder s = new StringBuilder(str);
        return new String(s.reverse());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            String[] arr = str.trim().split("\\s");
            String res = "";
            for(String s1 : arr){
                res += reverse(s1) + " ";
            }
            System.out.println(res.trim());
        }
    }
}
