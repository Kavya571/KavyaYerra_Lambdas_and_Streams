package com.epam.task;

import java.util.*; 
import java.util.stream.IntStream; 
  
public class Average {  
    public static void main(String[] args) 
    { 
        IntStream stream = IntStream.of(3,8,6,2,1,5,10,7,3); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("-1"); 
        } 
    } 
} 


