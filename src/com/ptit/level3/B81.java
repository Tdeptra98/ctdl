package com.ptit.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//DFS tren do thi vo huong
public class B81 {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];

    static void DFS(int u) {
        check[u] = 0;
        System.out.print(u + " ");
        for (int i = 0; i < list[u].size(); i++) {
            int v = list[u].get(i);
            if (check[v] == 1) DFS(v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int n = sc.nextInt();
            int start = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
                list[v].add(u);
            }
            for (int i = 0; i < check.length; i++) {
                check[i] = 1;
            }
            DFS(start);
            System.out.println();
        }
    }
}
