package com.myjava;

public class TemaryOperator {
    public static void main(String args[])  
    {  
    int time = 20;
    String result;
    result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result); 
        
    int x=69;  
    int y=89;  
    int z=79;  
    int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
    System.out.println("The largest numbers is:  "+largestNumber);  
     
    }
}
