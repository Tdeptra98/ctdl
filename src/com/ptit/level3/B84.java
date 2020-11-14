package com.ptit.level3;

import java.util.*;

//Duong di theo BFS tren do thi vo huong
public class B84 {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];
    static int[] before = new int[1005];
    static int start, end;

    static int[] traceBFS(int start, int end) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        check[start] = 0;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            for (int i = 0; i < list[u].size(); i++) {
                int v = list[u].get(i);
                if (check[v] == 1) {
                    check[v] = 0;
                    queue.add(v);
                    before[v] = u;

                }
            }
        }
        return before;
    }

    static void solve(int start, int end) {
        traceBFS(start, end);
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
