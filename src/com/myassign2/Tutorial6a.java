package com.myassign2;

import java.io.*;
import java.util.Date;

public class Tutorial6a {
    public static void main(String args[]) {
        String filePath = "D://ExampleDirectory//";
        File file = new File(filePath);
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println("Given file was last modified at: ");
        System.out.println(date);

    }
}
