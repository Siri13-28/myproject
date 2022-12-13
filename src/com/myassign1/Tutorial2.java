package com.myassign1;

public class Tutorial2 {
    public static void main(String[] args) {
        // tutorial2 (a)
        int input = 35;

        if (input > 0) {
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // tutorial2 (b)
        int a = 25;
        int b = 78;
        int c = 87;
        System.out.print(" Enter first number: " + a);

        System.out.print(" Enter second number: " + b);

        System.out.print(" Enter third number: " + c);

        if (a == b && b == c) {
            System.out.println("All the numbers are equal");
        } else {
            int g = a;

            if (b > g)
                g = b;

            if (c > g)
                g = c;

            System.out.println(" Greatest number: " + g);
        }

        // tutorial2 (c)
        // year to be checked
        int year = 800;
        boolean leap = false;

        // if the year is divided by 4
        if (year % 4 == 0) {

            // if the year is century
            if (year % 100 == 0) {

                // if year is divided by 400
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }

            // if the year is not century
            else
                leap = true;
        }

        else
            leap = false;

        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
