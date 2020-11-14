package com.ptit.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Sap xep chen
public class B33 {
    static int n;
    static int[] arr = new int[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
            Collections.sort(list);
            System.out.print("Buoc " + i + ": ");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j) + " ");
            }
            System.out.println();
        }

    }
}
