package com.myjava;

public class LogicalOperator {
    public static void main(String[] args) {
        //Variables Definition and Initialization
        boolean x1 = true, x2 = false;

        //Logical AND
        System.out.println("x1 && x2 = " + (x1 && x2));
        
        //Logical OR
        System.out.println("x1 || x2 = " + (x1 | x2) );
        
        //Logical Not
        System.out.println("!(x1 && x2) = " + !(x1 && x2));

       }
}
