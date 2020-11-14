package com.ptit.level1;

//Uoc so nguyen to lon nhat

import java.util.*;

public class B2 {
    static void solve(long n){
        for (int i = 2; i<= Math.sqrt(n) ; i++) {
            while(n % i == 0){
                n = n / i;
            }
        }
        System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long n = sc.nextLong();
            solve(n);
        }
    }
}
