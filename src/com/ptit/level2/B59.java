package com.ptit.level2;

import java.util.HashSet;
import java.util.Scanner;

//Quay hinh vuong
public class B59 {
    static HashSet<String> set;

    static class Square {
        public int[] arr = new int[6];

        public boolean equals(int[] arr2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) return false;
            }
            return true;
        }

        public Square() {

        }

        public Square(int[] new_arr) {
            for (int i = 0; i < 6; i++) {
                arr[i] = new_arr[i];
            }
        }

        public boolean visited() {
            return set.contains(toString());
        }

        public void mark() {
            set.add(toString());
        }

        public void rotate1() {
            int tmp = arr[0];
            arr[0] = arr[3];
            arr[3] = arr[4];
            arr[4] = arr[1];
            arr[1] = tmp;
        }

        public void rotate2() {
            int tmp = arr[1];
            arr[1] = arr[4];
            arr[4] = arr[5];
            arr[5] = arr[2];
            arr[2] = tmp;
        }

        public void print() {
            for (int i = 0; i < 6; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        @Override
        public String toString() {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < 6; i++) str.append(arr[i]);
            return str.toString();
        }
    }

    static Square[] queue = new Square[1000];
    static int[] steps = new int[1000];
    static int head, tail;
    static Square start = new Square();
    static Square end = new Square();

    static int solve() {
        head = 0;
        tail = 0;
        queue[0] = start;
        steps[0] = 0;
        start.mark();
        while (head <= tail) {
            Square top = queue[head];
            int topstep = steps[head];
            head++;
            if (top.equals(end.arr)) {
                return topstep;
            }

            Square left = new Square(top.arr);
            left.rotate1();
            if (!left.visited()) {
                tail++;
                left.mark();
                queue[tail] = left;
                steps[tail] = topstep + 1;
            }

            Square right = new Square(top.arr);
            right.rotate2();
            if (!right.visited()) {
                tail++;
                right.mark();
                queue[tail] = right;
                steps[tail] = topstep + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            start = new Square();
            end = new Square();
            for (int i = 0; i < 6; i++) {
                start.arr[i] = sc.nextInt();
            }
            for (int i = 0; i < 6; i++) {
                end.arr[i] = sc.nextInt();
            }
            set = new HashSet<>();
            System.out.println(solve());

        }
    }
}
