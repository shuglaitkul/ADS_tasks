package com.company;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(checkPrime(n));
    }

    public static int checkPrime(int n) {
        int num = 0, prime = 1;
        num = n / 2;
        if (n == 0 || n == 1) {
            System.out.println("Composite");
        } else {
            for (int i = 2; i <= num; i++) {
                if (n % i == 0) {
                    System.out.println("Composite");
                    prime = 0;
                    break;
                }
            }
            if (prime == 1) {
                System.out.println("Prime");
            }
        }
        return 0;
    }
}

