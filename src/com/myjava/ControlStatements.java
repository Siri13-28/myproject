package com.myjava;

public class ControlStatements {
    public static void main(String args[]) {
        // If..else statement
        int a = 18;
        if (a > 15)
            System.out.println("a is greater than 10");
        else
            System.out.println("a is less than 10");

        // While loop Statement
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i = i + 2;
        }

        // Switch statement
        int instrument = 5;
        String musicInstrument;
        // switch statement with int data type
        switch (instrument) {
        case 1:
            musicInstrument = "Guitar";
            break;
        case 2:
            musicInstrument = "Piano";
            break;
        case 3:
            musicInstrument = "Drums";
            break;
        case 4:
            musicInstrument = "Flute";
            break;
        case 5:
            musicInstrument = "Ukelele";
            break;
        case 6:
            musicInstrument = "Violin";
            break;
        case 7:
            musicInstrument = "Trumpet";
            break;
        default:
            musicInstrument = "Invalid";
            break;
        }
        System.out.println(musicInstrument);

        // For loop statement
        for (int j = 5; j <= 10; j++)
            System.out.println(j);

        // For-each loop statement
        int s[] = { 18, 25, 28, 30 };
        for (int y : s) {
            System.out.println(y);
        }

        // Break statement
        for (int d = 10; d < 20; d++) {
            if (d == 16)
                break;
            System.out.println(d);
        }

        // Continue statement
        for (int k = 5; k <= 18; k++) {
            // Odd numbers are skipped
            if (k % 2 != 0)
                continue;
            // Even numbers are printed
            System.out.print(k + " ");
        }
    }
}
