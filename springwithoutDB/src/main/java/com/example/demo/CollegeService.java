package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeService 
{
	private static Map<Integer,College> college = new HashMap();
	private static int index = 2 ;
	
	static
	{
		College c1 = new College(1,"VCET", "9876543225","Hyderabad");
		College c2 = new College(2,"VBIT", "8576243225","Hyderabad");
		
		college.put(1, c1);
		college.put(2, c2);	
	}
	
	public static List<College> getCollegeDetails()
	{
		return new ArrayList<>(college.values());	
	}
	
	//Search
	public static College getCollegeById(int c_id)
	{
		return college.get(c_id);
	}
	
	//Add
	public static College addCollege(College col)
	{
		index+=1;
		col.setC_id(index);
		college.put(index, col);
		return col;
	}
	
	//Delete
	public static College removeCollege(int c_id)
	{
		return college.remove(c_id);
	}
}
