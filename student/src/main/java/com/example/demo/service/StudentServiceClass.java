package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.ModelStudentClass;
import com.example.demo.repository.studentrepo;

@Service
public class StudentServiceClass {
	@Autowired
	public studentrepo rep;
	
	public ModelStudentClass savedetails(ModelStudentClass obj)
	{
		return rep.save(obj);
	}
	public void deletedetails(int id)
	{
		rep.deleteById(id);
	}
	public Optional<ModelStudentClass> getdetails(int id)
	{
		return rep.findById(id);
	}
	public ModelStudentClass updateInfo(ModelStudentClass id)
	{
		return rep.saveAndFlush(id);
	}

}
