package com.myjava;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //Variables Definition and Initialization
        int number1 = 12, number2 = 4;

        //Addition Operation
        int sum = number1 + number2;
        System.out.println("Sum is: " + sum);

        //Subtraction Operation
        int dif = number1 - number2;
        System.out.println("Difference is : " + dif);

        //Multiplication Operation
        int mul = number1 * number2;
        System.out.println("Multiplied value is : " + mul);

        //Division Operation
        int div = number1 / number2;
        System.out.println("Quotient is : " + div);

        //Modulus Operation
        int rem = number1 % number2;
        System.out.println("Remainder is : " + rem);
        
        //unary arithmetic operators
        int r = 6;
        System.out.println("r=: " + r++);
        System.out.println("r=: " + r);
        
        int x = 6;
        System.out.println("x=: " + x--);
        System.out.println("x=: " + x);
        
        int y = 6;
        System.out.println("y=: " + ++y);

        int p = 6;
        System.out.println("p=: " + --p);

       }
}
