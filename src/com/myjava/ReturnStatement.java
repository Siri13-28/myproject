package com.myjava;

public class ReturnStatement {
    public int CompareNum()   
    {   
        int x = 13;  
        int y = 8;  
        System.out.println("x = " + x + "\ny = " + y);  
        if(x>y)  
            return x;  
        else  
            return y;  
    }  
      
    /* Driver Code */  
    public static void main(String ar[])   
    {  
        ReturnStatement obj = new ReturnStatement();  
        int result = obj.CompareNum();  
        System.out.println("The greater number among x and y is: " + result);  
    } 
}
