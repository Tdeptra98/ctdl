package com.ptit.level1;

import java.util.Scanner;
import java.util.Stack;

//Bieu thuc dung
public class B30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            int del = 0, res = 0;
            for (int i = 0; i < s.length(); i++) {
                if(stack.size() == 0){
                    stack.push(s.charAt(i));
                }
                else if(stack.peek() == '[' && s.charAt(i) == ']'){
                    stack.pop();
                    del = del + 2;
                }
                else if(stack.peek() == ']' && s.charAt(i) == '['){
                    res += stack.size() + del;stack.pop();
                }
                else if(s.charAt(i) == '['){
                    stack.push(s.charAt(i));
                }
                else if(stack.peek() == ']' && s.charAt(i) == ']'){
                    stack.push(s.charAt(i));
                }
                if(stack.size() == 0) del = 0;
            }
            System.out.println(res);
        }
    }
}
