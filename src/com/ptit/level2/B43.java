package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Sua lai day ngoac
public class B43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String str = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' || str.charAt(i) == ')' && stack.size() == 0) {
                    stack.push(str.charAt(i));
                } else if (str.charAt(i) == ')') {
                    if (stack.size() > 0 && stack.peek() == '(') stack.pop();
                    else stack.push(str.charAt(i));
                }
            }
            int a = 0, b = 0;
            while (stack.size() > 0) {
                if (stack.peek() == '(') a++;
                else b++;
                stack.pop();
            }
            int res = a / 2 + b / 2 + a % 2 + b % 2;
            System.out.println(res);
        }
    }
}
