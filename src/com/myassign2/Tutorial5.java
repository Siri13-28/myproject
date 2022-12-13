package com.myassign2;
import java.util.HashMap;
public class Tutorial5 {
    public static void main(String[] args)
    {   
        //tutorial5(a)
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println("Tutorial5(a) output :");
        
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);

        System.out.println("Size of map is: "
                           + map.size());

        System.out.println(map);

        if (map.containsKey("sachin")) {
 
            Integer a = map.get("sachin");
 
            System.out.println("value for key"
                               + " \"sachin\" is: " + a);
        }
        
        //tutorial5(b)
        HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
        
        // populate hash maps
        System.out.println("\nTutorial5(b) output :");
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
        
        //tutorial5(c)
        System.out.println("\nTutorial5(c) output :");
        
        HashMap < String, Integer > h = new HashMap < String, Integer > ();
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
