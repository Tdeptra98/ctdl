package com.ptit.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Bieu dien do thi co huong
public class B80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            List<Integer>[] list = (List<Integer>[]) new List[1005];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<>();
            }
            int a = sc.nextInt();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list[u].add(v);
            }
            for (int i = 1; i <= a; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < list[i].size(); j++)
                    System.out.print(list[i].get(j) + " ");
                System.out.println();
            }
        }
    }
}
