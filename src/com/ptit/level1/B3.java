package com.ptit.level1;

import java.util.Arrays;
import java.util.Scanner;
//Tinh tong cac chu so
public class B3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            int index = 0, sum = 0;
            char[] arr = new char[100009];
            for (int i = 0; i < s.length(); i++) {
                if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                    arr[index++] = s.charAt(i);
                }
                else{
                    sum = sum + s.charAt(i) - '0';
                }
            }
            Arrays.sort(arr, 0, index);
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i]);
            }
            System.out.println(sum);
        }
    }
}
