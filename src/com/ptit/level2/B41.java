package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Day ngoac dung dai nhat
public class B41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.next();
            Stack<Integer> stack = new Stack<>();
            int res = 0;
            stack.push(-1);
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '('){
                    stack.push(i);
                }
                else{
                    stack.pop();
                    if(stack.size() > 0){
                        res = Math.max(res, i - stack.peek());
                    }
                    if(stack.size() == 0) stack.push(i);
                }
            }
            System.out.println(res);
        }
    }
}
