package com.ptit.level1;

import java.util.*;

//Gia tri nho nhat cua xau
public class B29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = Integer.parseInt(sc.next());
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                } else {
                    map.put(s.charAt(i), 1);
                }
            }
            int max = 0;
            Set<Character> set = map.keySet();
            Queue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> {
                if (o1 > o2) {
                    return -1;
                }
                if (o1 < o2) {
                    return 1;
                }
                return 0;
            });
            for (Character a : set) {
                queue.add(map.get(a));
            }
            while (n > 0) {
                int a = queue.poll();
                a--;
                queue.add(a);
                n--;
            }
            long sum = 0;
            while (!queue.isEmpty()) {
                int a = queue.poll();
                sum = sum + a * a;
            }
            System.out.println(sum);

        }
    }
}
