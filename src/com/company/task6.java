package com.company;

import java.util.Scanner;

public class task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Degree(scanner.nextInt(), scanner.nextInt()));
    }
    public static int Degree(int a, int n){
        if (n == 0){
            return 1;
        }
        return a * Degree(a, n-1);
    }
}
