package com.ptit.level1;

import java.util.Scanner;
import java.util.StringTokenizer;

//chuan hoa xau ho ten
public class B5 {

//    static String chuanhoa(String s){
//        StringTokenizer s1 = new StringTokenizer(s);
//        StringBuffer kq = new StringBuffer();
//        while(s1.hasMoreTokens()){
//            String s2 = s1.nextToken();
//            s2 = s2.toLowerCase();
//            String s3 = s2.substring(0, 1);
//            s2 = s2.replaceFirst(s3, s3.toUpperCase());
//            kq.append(s2).append(" ");
//        }
//        return kq.toString().trim();
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String s = scanner.nextLine();
            String[] strs = s.trim().toLowerCase().split("\\s++");
            String res = "";
            for (String str : strs) {
                res += str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
            }
            System.out.println(res.trim());
        }

    }
}
