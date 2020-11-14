package com.ptit.level1;

import java.util.PriorityQueue;
import java.util.Scanner;
//Noi day
public class B14 {

    static long mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            PriorityQueue<Long> a = new PriorityQueue<>();
            long val;
            for (int i = 0; i < n; i++) {
                val = sc.nextLong();
                a.add(val);
            }
            long res = 0;
            while(a.size() > 1){
                long x = a.poll();
                long y = a.poll();
                long temp = (x + y) % mod;
                a.add(temp);;
                res += temp;
                res %= mod;
            }
            System.out.println(res);
        }
    }
}
