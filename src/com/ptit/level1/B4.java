package com.ptit.level1;
//So dep
import java.util.Scanner;

public class B4 {
    static boolean isPalindrome(String str) {
        if(str == null)
            return false;
        str = str.toLowerCase();

        for(int i = 0, j = str.length() - 1; i < j; i++, j--) {

            if (str.charAt(i) != str.charAt(j) || Character.getNumericValue(str.charAt(i)) % 2 != 0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            if(isPalindrome(s)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
