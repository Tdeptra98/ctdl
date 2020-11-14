package com.ptit.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Me cung 1
public class B15 {
    static int n;
    static int[][] matrix = new int[100][100];
    static ArrayList<String> result = new ArrayList<>();
    static boolean check = false;

    static void solve(int i, int j, String str) {
        if (i == 1 && j == 1 && matrix[i][j] == 0) {
            check = false;
            return;
        }
        if (i == n && j == n && matrix[i][j] == 1) {
            result.add(str);
            check = true;
            return;
        }
        if (i < n && matrix[i + 1][j] == 1) {
            solve(i + 1, j, str + "D");
        }
        if (j < n && matrix[i][j + 1] == 1) {
            solve(i, j + 1, str + "R");
        }
        if (i < n && j < n && matrix[i][j + 1] == 0 || j > n || i > n){
            return;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            result.clear();
            check = false;
            solve(1, 1, "");
            if(!check){
                System.out.print(-1);
            }
            else{
                Collections.sort(result);
                for (int i = 0; i < result.size(); i++){
                    System.out.print(result.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}
