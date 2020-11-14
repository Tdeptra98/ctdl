package com.ptit.level2;

import java.util.*;

//Bien doi so nguyen to
public class B57 {
    static boolean[] isPrime = new boolean[10000];
    static int S, T;
    static String[] queue = new String[10000];
    static int head, tail;
    static int[] step = new int[10000];
    static boolean[] mark;

    static void init() {
        for (int i = 0; i < 10000; i++) isPrime[i] = true;
        for (int i = 2; i < 10000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < 10000; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    static int solution(String S, int T) {
        mark = new boolean[10000];
        head = 0;
        tail = 0;
        queue[0] = S;
        mark[Integer.parseInt(S)] = true;
        step[0] = 0;
        while (head <= tail) {
            String top = queue[head];
            int tops = step[head];
            head++;
            StringBuilder temp;
            for (int digit = 0; digit < 4; digit++) {
                for (int i = 0; i <= 9; i++) {
                    if (digit == 0 && i == 0) continue;
                    char c = (char) (i + 48);
                    temp = new StringBuilder(top);
                    temp.setCharAt(digit, c);
                    int number = Integer.parseInt(temp.toString());
                    if (!mark[number] && isPrime[number]) {
                        if (number == T) return tops + 1;
                        tail++;
                        queue[tail] = temp.toString();
                        step[tail] = tops + 1;
                        mark[number] = true;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        init();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            S = in.nextInt();
            T = in.nextInt();
            System.out.println(solution(Integer.toString(S), T));

        }
    }
}
