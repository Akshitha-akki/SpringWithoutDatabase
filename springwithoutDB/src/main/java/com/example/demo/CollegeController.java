package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollegeController 
{
	@GetMapping("/CollegeDetails")
	public List<College> getColleges()
	{
		return CollegeService.getCollegeDetails();
	}
	
	@GetMapping("/CollegeId/{c_id}")
	public College getCollegeById(@PathVariable int c_id)
	{
		return CollegeService.getCollegeById(c_id);
	}
	
	@PostMapping("/addCollege")
	public College addCollegedetails(@RequestBody College col)
	{
		return CollegeService.addCollege(col);
	}
	
	@DeleteMapping("/delete/{c_id}")
	public College removeWithId(@PathVariable int c_id)
	{
		return CollegeService.removeCollege(c_id);
	}
	
	
}
