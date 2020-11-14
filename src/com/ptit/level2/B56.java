package com.ptit.level2;

import java.util.*;

//Bien doi ST
public class B56 {
    static int S, T;
    static Map<Integer, Integer> map;
    static int head, tail;
    static int[] queue = new int[10000005];

    static int solve() {
        head = 0;
        tail = 0;
        queue[0] = S;
        map.put(S, 1);
        while (head <= tail) {
            int top = queue[head++];
            int step = map.get(top);
            if (top == T) return map.get(T) - 1;
            if (top < T) {
                int temp = top * 2;
                if (!map.containsKey(temp)) {
                    queue[++tail] = temp;
                    map.put(temp, step + 1);
                }
                temp = top - 1;
                if (temp >= 0 && !map.containsKey(temp)) {
                    queue[++tail] = temp;
                    map.put(temp, step + 1);
                }
            }
            else{
                int temp = top - 1;
                if (temp >= 0 && !map.containsKey(temp)) {
                    queue[++tail] = temp;
                    map.put(temp, step + 1);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            S = sc.nextInt();
            T = sc.nextInt();
            map = new HashMap<>();
            System.out.println(solve());
        }
    }
}
