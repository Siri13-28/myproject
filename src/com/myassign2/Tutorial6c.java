package com.myassign2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Tutorial6c {
    @SuppressWarnings("unused")
    public static void main(String args[]) {
        BufferedReader br = null;
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(
                    new InputStreamReader(new FileInputStream("/home/students/test.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3) {
                System.out.println(strLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }

}
