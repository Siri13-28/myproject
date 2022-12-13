package com.myassign2;

import java.util.HashMap;

public class Tutorial5c {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        h.put("Apple", 1);
        h.put("Cherry", 2);
        h.put("Avocado", 3);
        h.put("Kiwi", 4);
        h.put("Lemon", 5);
        System.out.println("The Original map: " + h);
        System.out.println("1. Is key 'Lemon' exists?");
        if (h.containsKey("Lemon")) {
            System.out.println("yes!, It's no." + h.get("Lemon"));
        } else {
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'Orange' exists?");
        if (h.containsKey("orange")) {
            System.out.println("yes! - " + h.get("orange"));
        } else {
            System.out.println("no!");
        }
    }
}
