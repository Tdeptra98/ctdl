package com.ptit.level3;

import java.util.*;

//BFS tren do thi vo huong
public class B82 {
    static List<Integer>[] list = (List<Integer>[]) new List[1005];
    static int[] check = new int[1005];
    static Queue<Integer> queue = new LinkedList<>();

    static void BFS(int start){
        queue.add(start);
        check[start] = 0;
        System.out.print(start + " ");
        while(!queue.isEmpty()){
            int x = queue.poll();
            for (int i = 0; i < list[x].size(); i++) {
                int y = list[x].get(i);
                if(check[y] == 1){
                    System.out.print(y + " ");
                    queue.add(y);
                    check[y] = 0;
                }
            }
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
            BFS(start);
            System.out.println();
        }
    }
}
