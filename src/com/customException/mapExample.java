package com.customException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class mapExample {
	 public static void main(String[] a)
	    {
	    	employee emp1 = new employee(1,"kavisha");
	    	employee emp2 = new employee(1,"kavisha");
	    	employee emp3 = new employee(1,"kavisha");
	    	
	    	HashMap<employee,String> emp=new HashMap<>();
	        emp.put(emp1,"kavi");
	        emp.put(emp2,"kavisha");
	        emp.put(emp3,"kaviii");
	        
	        for(Map.Entry<employee, String> entry : emp.entrySet()) {
	        	System.out.println(entry.getKey()+ " === " +entry.getValue());
	        }
	    	
	    }	

}
