package com.ptit.level2;

import java.util.Scanner;

//Sap xep doi cho dac biet
public class B31 {
    static int n;
    static int[] arr = new int[105];

    static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
            String str = "";
            str = "Buoc " + String.valueOf(i + 1) + ": ";
            for (int k = 0; k < n; k++) {
                str += String.valueOf(arr[k]) + " ";
            }
            System.out.println(str.trim());
        }
    }
}
