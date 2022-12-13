package com.myassign1;

public class JavaArraystream {
    public static void main(String[] args) {
        // declare and initialize and array
        int age[] = { 11, 25, 20, 34 };
        System.out.println("Age!!!");
        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);

        int[] data;
        data = new int[4];
        data[0] = 2;
        data[1] = 33;
        data[2] = 17;
        data[3] = 5;
        System.out.println("Data 0 :" + data[0]);
        System.out.println("Data 1 :" + data[1]);
        System.out.println("Data 2 :" + data[2]);
        System.out.println("Data 3 :" + data[3]);

        // Multidimensional array
        // 2d array
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6, 9 }, { 7 }, };
        // calculate the length of each row
        System.out.println("Length of row 1 :" + a[0].length);
        System.out.println("Length of row 2 :" + a[1].length);
        System.out.println("Length of row 3 :" + a[2].length);

        // copy array
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        int[] positiveNumbers = numbers; // copying arrays

        // change value of first array
        numbers[0] = -1;

        // printing the second array
        for (int number : positiveNumbers) {
            System.out.print(number + ", ");
        }

    }
}
