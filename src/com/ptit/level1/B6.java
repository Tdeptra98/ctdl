package com.ptit.level1;

import java.util.*;

//chuan hoa email PTIT
public class B6 {
    static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s1 = sc.nextLine();
        while(N-- > 0){
            String str = sc.nextLine();
            if(str.equals("")) return;
            String[] s = str.trim().toLowerCase().split("\\s++");
            String res = "";
            res += s[s.length - 1];
            for (int i = 0; i < s.length - 1; i++) {
                res += s[i].charAt(0);
            }
            if(map.get(res) == null){
                System.out.println(res + "@ptit.edu.vn");
                map.put(res, 1);
            }else{
                System.out.println(res + (map.get(res) + 1) + "@ptit.edu.vn");
                map.put(res, map.get(res) + 1);
            }
        }
    }
}
