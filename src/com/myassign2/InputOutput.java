package com.myassign2;
import java.io.*;
public class InputOutput {
    public static void main(String args[])
            throws IOException
        {
      
            InputStreamReader inp = null;
      
            inp = new InputStreamReader(System.in);
      
            System.out.println("Enter characters");
            char c;
            do {
                c = (char)inp.read();
                System.out.println(c);
            } while (c != '0');
        }
}
