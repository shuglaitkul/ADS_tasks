package com.company;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Fibonacci(scanner.nextInt()));
    }

    public static int Fibonacci(int fn){
        if(fn == 0) {
            return 0;
        }else if(fn == 1){
            return 1;
        } else {
            return Fibonacci(fn - 1) + Fibonacci(fn - 2);
        }
    }
}
