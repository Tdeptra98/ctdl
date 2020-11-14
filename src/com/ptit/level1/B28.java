package com.ptit.level1;

import java.util.Arrays;
import java.util.Scanner;

//Tong nho nhat
public class B28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int arr[] = new int[n + 2];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr, 0, n);
            String s1 = "", s2 = "";
            for (int i = 0; i < n; i++) {
                if(i % 2 == 0){
                    s1 += String.valueOf(arr[i]);
                }else{
                    s2 += String.valueOf(arr[i]);
                }
            }
            long sum = Long.parseLong(s1) + Long.parseLong(s2);
            System.out.println(sum);
        }
    }
}
