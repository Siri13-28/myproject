package com.myassign1;

import java.util.Scanner;

public class Tutorial2b {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("Enter first number:" + a);
        System.out.print("Enter second number:" + b);
        System.out.print("Enter third number:" + c);
        if (a == b && b == c) {
            System.out.println("All the numbers are equal");
        } else {
            int g = a;
            if (b > g)
                g = b;
            if (c > g)
                g = c;
            System.out.println("Greatest number:" + g);
        }
    }
}
