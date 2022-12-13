package com.myassign2;

public class Tutorial7b {
    public static void main(String[] args) {

        String str = "abcffgffcba", reverseStr = "";

        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is palindrome.");
        } else {
            System.out.println(str + " is not palindrome.");
        }
    }

}
