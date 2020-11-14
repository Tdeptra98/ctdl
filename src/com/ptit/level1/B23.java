package com.ptit.level1;

import java.util.Arrays;
import java.util.Scanner;

//ATM
public class B23 {
    static int[] arr;
    static int[] money;
    static int count;
    static int sum;
    static int temp;
    static int n;
    static int t;
    static Scanner sc = new Scanner(System.in);
    static  boolean isstop = false;

    public static void dequy(int i) {
        if (i == 0) {
            return;
        }
        if(isstop==false){
            for (int j = 1; j >= 0; j--) {
                arr[i] = j;
                if(isstop ==false){
                    temp = temp + arr[i] * money[i];


                    if (temp == sum && i > -1) {
                        result();
                        isstop = true;

                    } else if (temp < sum) {
                        dequy(i - 1);


                    }
                }
                if(isstop == false)
                    temp = temp - arr[i] * money[i];

            }
        }
    }

    public static void result() {
        for (int i = 1; i <= n; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }



    public static void main(String[] args) {
        t = sc.nextInt();
        while (t-- > 0) {
            temp = 0;
            count = 0;
            sum = 0;
            isstop = false;
            n = sc.nextInt();
            arr = new int[n + 1];
            money = new int[n + 1];
            sum = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                money[i] = sc.nextInt();
            }

            Arrays.sort(money, 1, n + 1);
            dequy(n);
            if (temp != sum) {
                System.out.println(-1);
            }
        }
    }
}
