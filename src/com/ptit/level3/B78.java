package com.ptit.level3;

import java.util.*;

//Chuyen tu danh sach canh sang danh sach ke
public class B78 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int v = sc.nextInt();
            int e = sc.nextInt();
            List<Integer>[] list = (List<Integer>[]) new List[1005];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < e; i++) {
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                list[a].add(b);
                list[b].add(a);
            }

            for (int i = 1; i <= v; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
