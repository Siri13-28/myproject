package com.myassign2;

import java.util.*;
import java.util.Map.Entry;

public class JavaHashMap {
    public static void main(String args[]) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "HashMap");
        map.put(2, "HashMap");
        map.put(3, "HashMap");

        System.out.println("Iterating Hashmap...");
        for (Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());

            HashMap<Integer, String> languages = new HashMap<>();
            languages.put(1, "Java");
            languages.put(2, "Python");
            languages.put(3, "JavaScript");
            System.out.println(languages);

            System.out.println("Keys: " + languages.keySet());

            System.out.println("Values: " + languages.values());

            System.out.println("Key/Value mappings: " + languages.entrySet());

        }
    }
}
