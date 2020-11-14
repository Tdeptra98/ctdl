package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Bien doi tien to - hau to
public class B44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            Stack<String> stack = new Stack<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '^' || str.charAt(i) == '%') {
                    String s1 = stack.pop();
                    String s2 = stack.pop();
                    String temp = s1 + s2 + String.valueOf(str.charAt(i));
                    stack.push(temp);
                }
                else{
                    stack.push(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println(stack.peek());
        }
    }
}
