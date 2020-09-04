package com.uday;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.uday.model.Employee;

public class Hash_Map_Demo { 
    public static void main(String[] args) 
    { 
  
        // Creating an empty HashMap 
        TreeMap<Employee, Integer> hashMap = new TreeMap<Employee, Integer>(); 
  
        // Mapping string values to int keys 
        hashMap.put(new Employee(10,"uday"), 10); 
        hashMap.put(new Employee(11,"uday"), 11); 
        hashMap.put(new Employee(12,"uday"), 12);   
        hashMap.put(new Employee(13,"uday"), 13); 
        
        for (Entry<Employee, Integer> e : hashMap.entrySet()) 
            System.out.println(e.getKey().toString() + " " + e.getValue()); 
        
        HashMap<String, Integer> map = new HashMap<>(); 
                    
    } 
} 