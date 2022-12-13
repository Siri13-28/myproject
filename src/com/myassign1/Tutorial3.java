package com.myassign1;

import java.util.Arrays;
import java.util.List;

public class Tutorial3 {
    public static void main(String[] args) {   
        //tutorial3 (a)
        int[] numbers = new int[] { 3, 4, 5, 7, 9};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
         sum = sum + numbers[i];
        //calculate average value
         double average = (float)sum / numbers.length;
         System.out.println("Average value is : " + average); 
         
        //tutorial3 (b)
         String[] num = {"25","14","56","15","36"};
         num[0] = num[num.length -1];
         String[] newNum = new String[num.length - 1];
         for(int j=0;j<newNum.length; j++) {
             newNum[j] = num[j];
         }
         System.out.println(Arrays.toString(newNum));    
         
       //tutorial3 (c)
       String [] stringArray= {"Python","JAVA","PHP","Perl","C#"};
       List<String> languagesList=Arrays.asList(stringArray);
       System.out.println(" List : " + languagesList);
    }
}
