package com.myassign2;

import java.util.HashMap;

public class Tutorial5a {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println("Size of map is: " + map.size());

        System.out.println(map);

        if (map.containsKey("sachin")) {

            Integer a = map.get("sachin");

            System.out.println("value for key" + " \"sachin\" is: " + a);
        }

    }
}
