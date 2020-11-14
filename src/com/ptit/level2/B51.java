package com.ptit.level2;

import java.util.*;

//So nhi phan tu 1 den N
public class B51 {
    static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();
        q.add("1");
        while(n-- > 0){
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            generateBinary(n);
            System.out.println();
        }
    }
}
