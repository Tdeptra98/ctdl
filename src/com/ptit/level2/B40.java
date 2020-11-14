package com.ptit.level2;

import java.util.Scanner;
import java.util.Stack;

//Kiem tra day ngoac dung
public class B40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String str = sc.nextLine();
            Stack<Character> v = new Stack<>();
            boolean check = true;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                    v.push(str.charAt(i));
                }
                else if(str.charAt(i) == ')'){
                    if(v.size() == 0) check = false;
                    else if(v.peek() == '(') v.pop();
                }
                else if(str.charAt(i) == ']'){
                    if(v.size() == 0) check = false;
                    else if(v.peek() == '[') v.pop();
                }
                else if(str.charAt(i) == '}'){
                    if(v.size() == 0) check = false;
                    else if(v.peek() == '{') v.pop();
                }
            }
            if(v.size() > 0) check = false;
            if(check) System.out.print("YES");
            else System.out.print("NO");
            System.out.println();
        }
    }
}
