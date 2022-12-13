package com.myassign2;
import java.util.*;
public class JavaHashSet {
    
    public static void main(String[] args)
    {
  
        HashSet<String> h = new HashSet<String>();
  
        h.add("Robert");
        h.add("Angle");
        h.add("Mary");
  
        System.out.println(h);
        System.out.println("Contains Mary or not:"
                           + h.contains("Mary"));
  
        h.remove("Angle");
        System.out.println("Removing Angle : "
                           + h);

        System.out.println("Iterating over list:");

        Iterator<String> i = h.iterator();

        while (i.hasNext())

            System.out.println(i.next());
    }
}
