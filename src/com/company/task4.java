package com.company;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Factorial(scanner.nextInt()));
    }

    public static int Factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * Factorial(n-1);
    }
}
