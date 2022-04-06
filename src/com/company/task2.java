package com.company;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(average(n, arr));
    }

    public static float average(int n, int[] arr){
        float sum = 0, res = 0;
        for (int i=0; i<n; i++){
            sum += arr[i];
            res = sum/n;
        }
        return res;
    }
}
