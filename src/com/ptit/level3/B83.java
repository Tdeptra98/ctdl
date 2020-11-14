package com.ptit.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//Duong di theo DFS tren do thi vo huong
public class B83 {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];
    static int[] before = new int[1005];
    static int start, end;

    static int[] traceDFS(int start, int end) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        check[start] = 0;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int i = 0; i < list[u].size(); i++) {
                int v = list[u].get(i);
                if (check[v] == 1) {
                    check[v] = 0;
                    stack.push(u);
                    stack.push(v);
                    before[v] = u;
                    break;
                }
            }
        }
        return before;
    }

    static void solve(int start, int end) {
        traceDFS(start, end);
        if (before[end] == 0) System.out.println("-1");
        else {
            Stack<Integer> stack = new Stack<>();
            stack.push(end);
            int u = before[end];
            while (u != start) {
                stack.push(u);
                u = before[u];
            }
            stack.push(start);
            while(!stack.isEmpty()){
                System.out.print(stack.pop() + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int n = sc.nextInt();
            start = sc.nextInt();
            end = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            for (int i = 0; i < check.length; i++) {
                check[i] = 1;
            }
            solve(start, end);
            System.out.println();
        }
    }
}
