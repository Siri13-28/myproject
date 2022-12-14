package com.myassign1;

import java.util.Arrays;

public class Tutorial3b {
    public static void main(String[] args) {
        String[] num = { "25", "14", "56", "15", "36" };
        num[0] = num[num.length - 1];
        String[] newNum = new String[num.length - 1];
        for (int j = 0; j < newNum.length; j++) {
            newNum[j] = num[j];
        }
        System.out.println(Arrays.toString(newNum));
    }
}
