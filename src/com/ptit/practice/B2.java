package com.ptit.practice;

import java.util.Scanner;

//Gray 2
public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if(i == 0){
                    System.out.print(str.charAt(i));
                }
                else{
                    if(str.charAt(i) != str.charAt(i - 1)) System.out.print(1);
                    else System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
