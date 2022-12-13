package com.myassign2;

public class JavaException {
    static int divideByZero(int a, int b) {
        int i = a / b;

        return i;
    }

    static int computeDivision(int a, int b) {

        int res = 0;

        try {

            res = divideByZero(a, b);
        }

        catch (NumberFormatException ex) {
            System.out.println(" ");
        }
        return res;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]) {

        int a = 1;
        int b = 0;

        try {
            var i = computeDivision(a, b);
        }

        catch (ArithmeticException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
