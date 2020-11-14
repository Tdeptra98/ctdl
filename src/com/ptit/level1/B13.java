package com.ptit.level1;

import java.util.*;

//Sap xep cong viec
public class B13 {
    public static int[] arr, deadline;
    public static int n;

    public static void swap(int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        temp = deadline[i];
        deadline[i] = deadline[j];
        deadline[j] = temp;
    }

    public static void sort(int a[], int s, int e) {
        if (s >= e)
            return;
        int index = (e - s) / 2 + s;
        int pivot = a[index];
        int k = s - 1;
        swap(index, e);
        for (int i = s; i < e; i++)
            if (a[i] < pivot) {
                k++;
                swap(i, k);
            }
        k++;
        swap(k, e);
        sort(a, s, k - 1);
        sort(a, k + 1, e);
    }

    public static void solve() {
        int res = 1;
        int end = deadline[0];
        for (int i = 1; i < n; i++) {
            if (deadline[i] == end)
                continue;
            if (arr[i] >= end) {
                res++;
                end = deadline[i];
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            arr = new int[n + 1];
            deadline = new int[n + 1];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                deadline[i] = sc.nextInt();
            }
            sort(deadline, 0, n - 1);
            solve();
        }
    }
}
