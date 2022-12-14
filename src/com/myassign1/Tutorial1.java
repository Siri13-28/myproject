package com.myassign1;

import java.util.Scanner;

public class Tutorial1 {
    public static void main(String[] args) {
        int i, j, k, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        n = sc.nextInt();
        for (i = 1; i <= n - 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n - 1; k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
