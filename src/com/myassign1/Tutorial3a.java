package com.myassign1;

public class Tutorial3a {
    public static void main(String[] args) {
        int[] numbers = new int[] { 3, 4, 5, 7, 9 };
        // calculate sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];
        // calculate average value
        double average = (float) sum / numbers.length;
        System.out.println("Average value is : " + average);     
    }
}
