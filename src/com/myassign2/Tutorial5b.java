package com.myassign2;

import java.util.HashMap;

public class Tutorial5b {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();

        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("Values in first map: " + hash_map1);

        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("Values in second map: " + hash_map2);

        // put all values in second map
        hash_map2.putAll(hash_map1);
        System.out.println("copy the specified map to another map: " + hash_map2);
    }
}
