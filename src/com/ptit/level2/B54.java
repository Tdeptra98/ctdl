package com.ptit.level2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

//So 0 va so 9
public class B54 {
    static int MAX_COUNT = 9000;
    static List<String> vec = new LinkedList<String>();

    static void generateNumber() {
        Queue<String> q = new LinkedList<String>();
        q.add("9");
        for (int count = MAX_COUNT;
             count > 0; count--) {
            String s1 = q.peek();
            q.remove();

            vec.add(s1);

            String s2 = s1;

            q.add(s1 + "0");

            q.add(s2 + "9");
        }
    }

    static String findSmallest(int n) {
        for (int i = 0; i < vec.size(); i++) {
            if (Integer.parseInt(vec.get(i)) % n == 0) {
                return vec.get(i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            generateNumber();
            System.out.println(findSmallest(n));
        }
    }
}
