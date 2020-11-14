package com.ptit.level1;

import java.util.Scanner;

//Hoan vi ke tiep
public class B9 {

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] data = new int[1005];
            for (int i = 1; i <= n; i++) {
                data[i] = sc.nextInt();
            }
            int lenght = n - 1;
            while (lenght > 0 && data[lenght] > data[lenght + 1]){
                lenght--;
            }
            if(lenght > 0){
                int k = n;
                while(data[k] < data[lenght]){
                    k--;
                }
                swap(data, lenght, k);
                int begin = lenght + 1;
                int end = n;
                while(begin < end){
                    swap(data, begin, end);
                    begin++;
                    end--;
                }
            }
            else{
                for (int i = 1; i <= n ; i++) {
                    data[i] = 1;
                }
            }
            for (int i = 1; i <= n ; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("");
        }
    }
}
