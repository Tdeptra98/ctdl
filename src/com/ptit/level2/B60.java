package com.ptit.level2;

import java.util.Scanner;

//Di chuyen tranh vat can
public class B60 {
    static int n;
    static int[][] map;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int[][] matrix2;
    static int[] er = new int[100000];
    static int[] ec = new int[100000];
    static int head, tail;
    static int startr, startc, endr, endc;

    static void mark(int row, int col, int move) {
        int tmp;
        tmp = row - 1;
        while (tmp >= 0 && map[tmp][col] == 0) {
            if (matrix2[tmp][col] == -1 || matrix2[tmp][col] > move) {
                matrix2[tmp][col] = move;
                tail++;
                er[tail] = tmp;
                ec[tail] = col;
            }
            tmp--;
        }
        tmp = row + 1;
        while (tmp < n && map[tmp][col] == 0) {
            if (matrix2[tmp][col] == -1 || matrix2[tmp][col] > move) {
                matrix2[tmp][col] = move;
                tail++;
                er[tail] = tmp;
                ec[tail] = col;
            }
            tmp++;
        }
        tmp = col - 1;
        while (tmp >= 0 && map[row][tmp] == 0) {
            if (matrix2[row][tmp] == -1 || matrix2[row][tmp] > move) {
                matrix2[row][tmp] = move;
                tail++;
                er[tail] = row;
                ec[tail] = tmp;
            }
            tmp--;
        }
        tmp = col + 1;
        while (tmp < n && map[row][tmp] == 0) {
            if (matrix2[row][tmp] == -1 || matrix2[row][tmp] > move) {
                matrix2[row][tmp] = move;
                tail++;
                er[tail] = row;
                ec[tail] = tmp;
            }
            tmp++;
        }
    }

    static void solve(int sr, int sc) {
        head = 0;
        tail = 0;
        er[0] = sr;
        ec[0] = sc;
        matrix2[sr][sc] = 1;
        mark(sr, sc, 1);

        while (head <= tail) {
            int topr = er[head];
            int topc = ec[head];
            int topv = matrix2[topr][topc];
            head++;
            mark(topr, topc, topv + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            n = Integer.parseInt(sc.nextLine());
            map = new int[n][n];
            matrix2 = new int[n][n];
            for (int i = 0; i < n; i++) {
                String tmp = sc.nextLine();
                for (int j = 0; j < n; j++) {
                    if (tmp.charAt(j) == '.') map[i][j] = 0;
                    else map[i][j] = 1;
                    matrix2[i][j] = -1;
                }
            }
            startr = sc.nextInt();
            startc = sc.nextInt();
            endr = sc.nextInt();
            endc = sc.nextInt();
            sc.nextLine();
            solve(startr, startc);
            System.out.println(matrix2[endr][endc]);
        }

    }
}
