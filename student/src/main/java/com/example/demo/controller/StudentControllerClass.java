package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ModelStudentClass;
import com.example.demo.service.StudentServiceClass;

@RestController
public class StudentControllerClass {
	
	@Autowired
	public StudentServiceClass std;
	
	//posting given details
	@PostMapping("/details")
	public ModelStudentClass savedetails(@RequestBody ModelStudentClass obj)
	{
		return std.savedetails(obj);
	}
	
	//deleting details
	@DeleteMapping("/details/{id}")
	public String deletedetails(@PathVariable ("id")int id)
	{
		std.deletedetails(id);
		return "Deleted successfully!";
	}
	
	//getting given details
	@GetMapping("/details/{id}")
	public Optional<ModelStudentClass> getdetails(@PathVariable ("id")int id)
	{
		return std.getdetails(id);
	}
	
	//updating given details
	@PutMapping("/updatedetails")
	public ModelStudentClass updateDetails(@RequestBody ModelStudentClass id)
	{
		return std.updateInfo(id);
	}
}
