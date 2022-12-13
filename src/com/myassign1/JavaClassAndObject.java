package com.myassign1;

public class JavaClassAndObject {
    String name;
    int age;
    
    public void speak() {
        System.out.println("Hello, My name is "+ name);
        System.out.println("I am "+ age + " years old");
    }
    public static void main(String[]args) {
        JavaClassAndObject a;
        a = new JavaClassAndObject();
        a.name = "Mary";
        a.age = 25;
        a.speak();
    }
}
