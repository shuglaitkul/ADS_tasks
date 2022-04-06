package com.company;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Min(n, arr));
    }

    public static int Min(int n, int[] arr) {
        int min_val = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min_val)
                min_val = arr[i];
        }
        return min_val;
    }
}

