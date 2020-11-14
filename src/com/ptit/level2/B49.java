package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Hinh chu nhat lon nhat
public class B49 {
    public static int n;
    public static int[] arr, L, R;

    static void init() {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if (stack.isEmpty()) L[i] = -1;
            else L[i] = stack.peek();
            stack.push(i);
        }
        while (!stack.isEmpty()) stack.pop();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            if (stack.isEmpty()) R[i] = n;
            else R[i] = stack.peek();
            stack.push(i);
        }
    }

    static void solve() {
        long max = 0;
        for (int i = 0; i < n; ++i) {
            long t = (long) arr[i] * (R[i] - L[i] - 1);
            if (max < t) max = t;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            L = new int[100000];
            R = new int[100000];
            init();
            solve();

        }
    }
}
