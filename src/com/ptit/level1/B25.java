package com.ptit.level1;

import java.util.Arrays;
import java.util.Scanner;

//Hoan vi xau ki tu
public class B25 {
    static String str;
    static int[] a = new int[100];
    static boolean check[] = new boolean[100];
    static void solve(int i){
        for (int j = 0; j < str.length(); j++) {
            if(!check[j]){
                a[i] = j;
                check[j] = true;
                if(i == str.length()){
                    for (int k = 1; k <= str.length() ; k++) {
                        System.out.print(str.charAt(a[k]));
                    }
                    System.out.print(" ");
                }
                else solve(i + 1);
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            char tempArray[] = s.trim().toCharArray();
            Arrays.sort(tempArray);
            str = new String(tempArray);
            solve(1);
            System.out.println();
        }
    }
}
