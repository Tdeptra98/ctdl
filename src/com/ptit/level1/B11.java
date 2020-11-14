package com.ptit.level1;

import java.util.Arrays;
import java.util.Scanner;

//Liet ke tap con
public class B11 {
    static String[] arr = new String[100009];
    static String str;
    static int n, length;
    static int[] a = new int[25];

    static void solve(int i){
        for (int j = 0; j < 2; j++) {
            a[i] = j;
            if(i < n){
                solve(i + 1);
            }else{
                String temp = "";
                for (int k = 1; k <= n; k++) {
                    if(a[k] == 1){
                        temp += str.charAt(k - 1);
                    }
                }
                if(!temp.equals("")){
                    arr[length++] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            n = Integer.parseInt(sc.nextLine());
            str = sc.nextLine();
            length = 0;
            for (int i = 0; i < 25; i++) {
                a[i] = 0;
            }
            solve(1);
            Arrays.sort(arr, 0, length);
            System.out.print(arr[0] + " ");
            for (int i = 1; i < length; i++) {
                if(!arr[i].equals(arr[i - 1])){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
}
