package com.company;

import java.util.Scanner;

public class task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(BinomialCoefficient(n, k));
    }
    public static int BinomialCoefficient(int n, int k){
        if(k == 0){
            return 1;
        } else {
            return Factorial(n) / (Factorial(k) * Factorial(n-k));
        }
    }

    public static int Factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return num * Factorial(num-1);
    }
}
