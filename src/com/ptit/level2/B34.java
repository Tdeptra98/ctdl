package com.ptit.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//Sap xep noi bot
public class B34 {
    static int n;
    static int[] arr = new int[105];
    static ArrayList<Integer> list = new ArrayList<>();

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
           list.add(arr[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            boolean check = false;

            for (int j = 0; j < n; j++) {
                if (arr[j] != list.get(j)) {
                    check = true;
                    break;
                }
            }

            if (!check) break;

            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
            }
            System.out.print("Buoc " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
