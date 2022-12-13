package com.myassign1;

public class JavaMethod {
    public static int multiply(int a,int b) {
        int total = a * b ;
        return total;
    }
    public static int add(int a,int b) {
        int total = a + b ;
        return total;
    }
    public static void main(String[]args) {
        //User-defined Methods
        int multiplyResult = multiply(2, 3);
        System.out.println("multiply result:" + multiplyResult);
       
        int addResult = add(2, 2);
        System.out.println("add result:" + addResult);
        
        //Standard Library Methods
        //using the square root() method
        System.out.print("Square root of 4 is:" + Math.sqrt(4));

    }
}
