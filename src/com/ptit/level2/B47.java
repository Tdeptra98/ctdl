package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Tinh gia tri bieu thuc tien to
public class B47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            Stack<Long> stack = new Stack<>();
            for (int i = str.length() - 1; i >= 0; i--) {
                if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '^' || str.charAt(i) == '%') {
                    long a = stack.pop();
                    long b = stack.pop();
                    long temp = 0;
                    if(str.charAt(i) == '+') temp = b + a;
                    else if(str.charAt(i) == '-') temp = a - b;
                    else if(str.charAt(i) == '*') temp = a * b;
                    else if(str.charAt(i) == '/') temp = a / b;
                    else if(str.charAt(i) == '%') temp = a % b;
                    else if(str.charAt(i) == '^') temp = (long) Math.pow(a, b);
                    stack.push(temp);
                }
                else{
                    stack.push(new Long(Character.getNumericValue(str.charAt(i))));
                }
            }
            System.out.println(stack.peek());
        }
    }
}
