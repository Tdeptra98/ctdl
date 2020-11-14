package com.ptit.level2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//So BDN 2
public class B53 {

    static long solve(long n) {
        Queue<Long> q = new LinkedList<>();

        q.add((long) 1);

        long t;

        while (q.size() > 0) {
            t = q.peek();
            if (t % n == 0) return t;
            q.remove();

            q.add(t * 10);
            q.add(t * 10 + 1);

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(solve(n));
        }
    }
}
