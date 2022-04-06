package com.company;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(array(n, arr));

    }
    public static int array(int n, int[] arr){
        if (n < 0) {
            return 0;
        }
        for (int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return 0;
    }
}

